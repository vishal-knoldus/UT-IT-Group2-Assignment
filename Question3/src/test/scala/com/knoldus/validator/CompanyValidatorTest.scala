package com.knoldus.validator

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends AnyFlatSpec {

  "Company" should "be valid" in {

    val companyValidator = new CompanyValidator()

    val testComapny: Company = Company("Sony",
      "sony@sony.com",
      "Noida")

    val result = companyValidator.companyIsValid(testComapny)

    assert(result)

  }

  it should "not be valid as email is not valid" in {

    val companyValidator = new CompanyValidator()

    val testComapny: Company = Company("Sony",
      "sony$123@sony.com",
      "Noida")

    val result = companyValidator.companyIsValid(testComapny)

    assert(!result)

  }

  it should "not be valid as company exists" in {

    val companyValidator = new CompanyValidator()

    val testComapny: Company = Company("Philips",
      "phil.123@philips.com",
      "Noida")

    val result = companyValidator.companyIsValid(testComapny)

    assert(!result)

  }

  it should "not be valid as email is not valid and company exists" in {

    val companyValidator = new CompanyValidator()

    val testComapny: Company = Company("Philips",
      "phil$123@philips.com",
      "Noida")

    val result = companyValidator.companyIsValid(testComapny)

    assert(!result)

  }

}
