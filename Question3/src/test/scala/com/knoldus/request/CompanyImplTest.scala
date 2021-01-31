package com.knoldus.request

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.
class CompanyImplTest extends AnyFlatSpec {

  "CompanyImplTest" should "create company" in {

    val testCompany: Company = Company("Sony",
      "sony@sony.com",
      "Noida")

    val mockedCompanyValidator = mock[CompanyValidator]
    when(mockedCompanyValidator.companyIsValid(testCompany)) thenReturn true

    val companyImplTest = new CompanyImpl(mockedCompanyValidator)

    val result = companyImplTest.createCompany(testCompany)

    assert(result == Option(testCompany.name))

  }

  it should "not create company" in {

    val testCompany: Company = Company("Sony",
      "sony$123@sony.com",
      "Noida")

    val mockedCompanyValidator = mock[CompanyValidator]
    when(mockedCompanyValidator.companyIsValid(testCompany)) thenReturn false

    val companyImplTest = new CompanyImpl(mockedCompanyValidator)

    val result = companyImplTest.createCompany(testCompany)

    assert(result.isEmpty)

  }

}
