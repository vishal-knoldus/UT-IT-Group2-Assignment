package com.knoldus.validator

class EmailValidator {
  // checking if email is valid by matching the regular expression
  def emailIdIsValid(emailId: String): Boolean = {
    val emailIdRegex: String = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"

    if (!emailId.matches(emailIdRegex))
      return false

    true
  }
}