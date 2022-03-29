package lectures.part2oop

object methodNotations extends App{

  class Person(val name:String, favoriteMovie: String,val age:Int) {
    def likes(movie: String):Boolean = movie == favoriteMovie
    def +(nickname:String):Person = new Person(s"${this.name} (${nickname})",favoriteMovie,age)
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name,favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(n:Int): String = s"Hi, my name is $name and I watched $favoriteMovie $n times"
    def learns(thing:String):String = s"${this.name} learns $thing"
  }

  val mary = new Person("Mary", "Inception",26)
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  //infix notation - operator notation

  // "operators" in Scala
  val tom = new Person("Tom","Fight Club",25)

  //All operators are methods
  //akka actors have ! ?

  // prefix notation

  val x = -1 // equivalent of 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !

  //println(!mary)
  //println(mary.unary_!)

  // postfix notation
  //println(mary.isAlive)

  // apply
  //println(mary.apply())
  //print(mary()) //equivalent

  println(mary(2))

  /*
  1. overload the + operator receive a string e replace the name
      mary + "the rockstar" => new person "Mary the rockstar"

  2. Add an age to the Person class
      Add unary + operator => new person with the age +1
      +mary => mary with age incremented
  3. add a "learns" method in the Person Class => Mary learns scala
    add a learnsScala method, calls learns method with "scala"
    Use it in postfix notation

  4. Overload the apply method
  mary.apply(2) => "Mary watched inception 2 times"
   */
}
