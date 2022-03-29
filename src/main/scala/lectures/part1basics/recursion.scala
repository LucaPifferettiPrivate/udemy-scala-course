package lectures.part1basics

object recursion extends App {
  def factorial(n: Int): Int =
    if (n<=1) 1
    else {
      println("Computing factorial of" + n + " - I first need factorial of "+ (n-1))
      val result=n*factorial(n-1)
      println("Computed factorial of" + n)
      result
    }

  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x:Int, accumulator: BigInt): BigInt =
      if(x<=1) accumulator
      else factHelper(x-1,x*accumulator) //tail recursion = use recursive call as the LAST expression
    factHelper(n,1)
  }

  println(anotherFactorial(20000))
  /*
  anotherFactorial(10) = factHelper(10,1) =
  factHelper(9,10*1) =
  factHelper(8,9*10*1) =
  factHelper(7,8*9*10*1) =
  ... =
  factHelper(2,3*4*5*6*7*8*9*10)=
  factHelper(1,2*3*...*9*10)=
  1*2*3...*10
   */
  println(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION

  /*
  1. Concatenate a string n times
  2. IsPrime function tail recursive
  3. Fibonacci function, tail recursive.
   */

  def concatenateString(stringa:String,n:Int): String ={

    def stringHelper(n:Int,stringa:String,accumulator:String): String = {
      if(n<=1) accumulator
      else  stringHelper(n-1,stringa,stringa + accumulator)
    }
    stringHelper(n,stringa,stringa)
  }
  println(concatenateString("ciao",4))

  def primeNumberTail(n:BigInt):Boolean = {
    def primeHelper(t:BigInt,accumulator:Boolean):Boolean = {
      if(t<=1) accumulator
      else primeHelper(t-1,n % t != 0 && accumulator)
    }
    primeHelper(n/2,true)
  }


    def fibonacci(n:Int):Int = {
      def fiboTailrec(i:Int, last: Int, nextToLast: Int): Int = {
        if (i>=n) last
        else fiboTailrec(i+1,last+nextToLast, last)
      }
    if (n<=2) 1
    else fiboTailrec(2,1,1)
    }
  println(fibonacci(3))

}
