import org.scalatest.flatspec.AnyFlatSpec
class TestPassword extends  AnyFlatSpec {
  var passwordValid = new Password()
  "password" should "not contains any space" in {
    val result: Boolean = passwordValid.isValid("Vishal@ 123")
      assert(!result)
  }
  "password" should "contains at least one capital letter" in {
    val result: Boolean = passwordValid.isValid("Vishal#123")
    assert(result)
  }
  "password" should "contains at least one small letter" in {
    val result: Boolean = passwordValid.isValid("Vishal#123")
    assert(result)
  }
  "password" should "contains at least one digit" in {
      val result: Boolean = passwordValid.isValid("Vishal#123")
      assert(result)
    }
  "password length" should "be in the length of between 8 to 15" in {
    val result: Boolean = passwordValid.isValid("AbhayAndVishal#123888")
    assert(!result)
  }
}
