class Password {
  def isValid(password: String): Boolean = {

    // Password should not contain any space
    if (password.contains(" ")) return false

    // Password should contain at least one digit(0-9)
    if (true) {
      var check:Int = 0
      // check digits from 0 to 9
      for (number <- 0 to 9) {
        // to convert int to string
        val digit = Integer.toString(number)
        if (password.contains(digit))
          check = 1
      }
      if (check == 0) return false
    }

    // Password length should be between 8-15 characters
    if (!((password.length() >= 8)
      && (password.length() <= 15)))
      return false

    // Password should contain at least one lowercase letter(a-z)
    if (true) {
      var check:Int = 0
      // checking for lowercase letters using ASCII Code
      for (asciiValue <- 97 to 122) {
        val alphabet = asciiValue.toChar
        val alphabetStr = Character.toString(alphabet)
        if (password.contains(alphabetStr)) check = 1
      }
      if (check == 0) return false
    }

    // Password should contain at least one uppercase letter(A-Z)
    if (true) {
      var check:Int = 0
      // checking for uppercase letters using ASCII Code
      for (asciiValue <- 65 to 90) {
        val alphabet = asciiValue.toChar
        val alphabetStr = Character.toString(alphabet)
        if (password.contains(alphabetStr)) check = 1
      }
      if (check == 0) return false
    }

    // Password should contain at least one special character ( @, #, %, &, !, $, etc)
    if ( !(password.contains("!") || password.contains("@")
      || password.contains("#") || password.contains("$")
      || password.contains("%") || password.contains("^")
      || password.contains("&") || password.contains("*")
      )) {
      return false
    }
    true
  }
}