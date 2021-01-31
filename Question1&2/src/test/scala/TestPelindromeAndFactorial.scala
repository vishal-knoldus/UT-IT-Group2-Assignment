import org.scalatest.flatspec.AnyFlatSpec
class TestPelindromeAndFactorial extends AnyFlatSpec {

   behavior of "TestPelindromeAndFactorial"

  it should "be a pelindrome" in {
    val number = new PelindromeAndFactorial()
    val result = number.isPelindrome(12321)
    assert(result)
  }
  it should "not be a pelindrome" in {
    val number = new PelindromeAndFactorial()
    val result = number.isPelindrome(1232)
    assert(!result)
  }
  it should "factorial" in {
    val number = new PelindromeAndFactorial()
    val result = number.factorial(4)
    assert(result == 24)
  }
}
