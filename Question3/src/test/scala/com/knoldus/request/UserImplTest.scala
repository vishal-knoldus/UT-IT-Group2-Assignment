package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplTest extends AnyFlatSpec {

  behavior of "UserImplTest"

  it should "create user" in {

    val testUser: User = User("Shivam",
      "shivam@knoldus.com",
      "Knoldus")

    val mockedUserValidator = mock[UserValidator]
    when(mockedUserValidator.isValid(testUser)) thenReturn true

    val userImplTest = new UserImpl(mockedUserValidator)

    val result = userImplTest.createUser(testUser)

    assert(result == Option(testUser.emailId))

  }

  it should "not create user" in {

    val testUser: User = User("Shivam",
      "shivam$123@sony.com",
      "Sony")

    val mockedUserValidator = mock[UserValidator]
    when(mockedUserValidator.isValid(testUser)) thenReturn false

    val userImplTest = new UserImpl(mockedUserValidator)

    val result = userImplTest.createUser(testUser)

    assert(result.isEmpty)

  }

}