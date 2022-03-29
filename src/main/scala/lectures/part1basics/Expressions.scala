package lectures.part1basics

object Expressions extends App{
    val x:Int = 1 + 2 //expression
    println(x)
    println(2+3*4)
    // + - * / & | ^ << >> >>> (right shift with zero extension)
    println(1==x)
  // == != > >= < <=
  println(!(1==x))

  var aVariable=2
  aVariable += 3 // also works with -= *=
  println(aVariable)

  // Instructions (DO) vs Expressions

  // IF expression
  val aCondition = true
  val aConditionedValue=if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  while (i<10){
    println(i)
    i +=1
  }
  // PLEASE NEVER WRITE THIS AGAIN

  // everything in scala is an expression
  val aWeirdValue = (aVariable=3)
  println(aWeirdValue)
  //side effects: println(), whiles, reassigning

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z>2) "hello" else "goodbye"
  }

  // what is the difference between "hello world" and println("hello world")
  //
  val somevalue = {
    2 < 3
  }
  println(somevalue)
  val someOtherValue = {
    if(somevalue) 239 else 986
    42
  }
  println(someOtherValue)
}
