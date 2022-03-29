package lectures.part1basics

object Functions extends App{

  def aFunction(a:String,b:Int):String = {
    a + " " + b
  }

  println(aFunction("hello",3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction)

  def aRepeatedFunction(aString:String, n:Int): String = {
    if(n==1) aString
    else aString + aRepeatedFunction(aString,n-1)
  }
  println(aRepeatedFunction("hello",3))

  //WHEN YOU NEED LOOPS USE RECURSION.

  def aFunctionWithSideEffects(aString:String): Unit = println(aString)

  def aBigFunction(n:Int):Int = {
    def aSmallerFunction(a:Int,b:Int):Int = a+b

    aSmallerFunction(n,n-1)
  }


  /*
  1. A greeting function (name,age) => "Hi my name is $name and I am $age year old
  2. Factorial function 1 * 2 * 3 * .. * n
  3. a fibonacci function
    f(1)=1
    f(1)=1
    f(n) = f(n-1) + f(n-2)
  4. Tests if a number is prime
   */

  def greetingFunction(name:String,age:Int) = {
    println(s"Hello my name is $name and I'm $age years old")
  }
  greetingFunction("Luca",26)

  def aFactorialFunction(n:Int): Int = {
    if (n == 1) 1
    else n * aFactorialFunction(n - 1)
  }

  def aFibonacciFunction(n:Int):Int = {
    if(n <= 1) 1
    else aFibonacciFunction(n-1) + aFibonacciFunction(n-2)
  }
 // 1 1 2 3 5 8 13
  println(aFibonacciFunction(6))

  def primeNumber(n:Int):Boolean = {
    def isPrimeUntil(t:Int):Boolean =
      if (t<=1) true
      else n % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(n/2)
  }
}
