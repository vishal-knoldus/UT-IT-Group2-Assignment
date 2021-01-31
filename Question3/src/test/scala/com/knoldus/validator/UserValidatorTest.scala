package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec {

  val userValidator = new UserValidator()

  "User" should "be valid as company exists and email is valid" in {

    val testUser: User = User("Shivam",
      "shivam@knoldus.com",
      "Knoldus")

    val result = userValidator.isValid(testUser)

    assert(result)

  }

  it should "not be valid as email is not valid" in {

    val testUser: User = User("Shivam",
      "shivam$123@sony.com",
      "Philips")

    val result = userValidator.isValid(testUser)

    assert(!result)

  }

  it should "not be valid as company doesn't exists" in {

    val testUser: User = User("Shivam",
      "shivam.123@sony.com",
      "Sony")

    val result = userValidator.isValid(testUser)

    assert(!result)

  }

  it should "not be valid as email is not valid and company doesn't exists" in {

    val testUser: User = User("Shivam",
      "shivam$123@sony.com",
      "Sony")

    val result = userValidator.isValid(testUser)

    assert(!result)

  }

}