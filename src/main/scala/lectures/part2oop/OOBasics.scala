package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John",26)
  println(person.x)
  person.greet("Daniel")
  person.greet()
  val author = new Writer("Charles","Dickens",1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter(10)
  counter.inc.print
}
//constructor
class Person(name: String, val age:Int = 0){
  //body
  val x = 2
  println(1+3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  // overloading
  def greet():Unit = println(s"Hi, I am $name")

  //multiple constructors

}

/*
Novel and a Writer
write: first name, surname, year
-method: fullname-> name+surname

Novel:name, year of release, author
-authorAge -> age of the author at the year of release
-iswrittenBy(author)
-copy (new year of release) = new instance of Novel
 */

class Writer(val first_name:String,val surname:String,val year:Int){
  def fullName():String = first_name+" "+surname
}

class Novel(name:String,year_release:Int,author:Writer){
  def authorAge(): Int = year_release - author.year
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(new_year_release:Int): Novel = new Novel(this.name,new_year_release,this.author)
}

class Counter(val count:Int) {
  def inc = {
    println("incrementing")
    new Counter(count+1)
  } //immutability
  def dec = {
    println("decrementing")
    new Counter(count-1)
  }

  def inc(n:Int):Counter = {
    if(n<=0) this
    else inc.inc(n-1)
  }
  def dec(n:Int):Counter = {
    if(n<=0) this
    else dec.dec(n-1)
  }

  def print= println(count)

}
/*
counter class
- receives an int value
- method: current count
- method to increment/decrement -> new Counter
-overload inc/dec to receive an amount -> new counter
 */