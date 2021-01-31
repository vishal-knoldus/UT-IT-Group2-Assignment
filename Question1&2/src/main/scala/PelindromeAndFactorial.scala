trait PelindromeFactorial{
  def isPelindrome(inputNumber : Int) : Boolean
  def factorial(inputNumber : Int) : Int
}
class PelindromeAndFactorial extends PelindromeFactorial{
  override def isPelindrome(inputNumber: Int): Boolean = {
    val inputNumberToString = inputNumber.toString
    val lengthOfInputString = inputNumberToString.length
    for(counter <- 0 until lengthOfInputString / 2)
      {
        if(inputNumberToString(counter) != inputNumberToString(lengthOfInputString - counter - 1))
          return false
      }
    true
  }

  override def factorial(inputNumber: Int): Int = {
    var factorial=1
    for(number <- 1 to inputNumber){
      factorial=factorial*number
    }
    factorial
  }
}
