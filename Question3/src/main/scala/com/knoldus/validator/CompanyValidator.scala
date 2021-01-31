package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {
  def companyIsValid(company: Company): Boolean = {
    // company should not exist in db
    val companyReadDto = new CompanyReadDto()
    val dbResult: Option[Company] = companyReadDto.getCompanyByName(company.name)

    // email should be valid
    val emailValidator = new EmailValidator()
    val emailValidatorResult = emailValidator.emailIdIsValid(company.emailId)

    if (dbResult.isEmpty && emailValidatorResult) return true

    false
  }
}