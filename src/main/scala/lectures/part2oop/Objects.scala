package lectures.part2oop

object Objects extends App{
  // SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY
  object Person { // type + its only instance
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method
    def apply(mother:Person,father:Person): Person = new Person("bobbie")
  }

  class Person(val name: String) {
    //instance-level functionality
  }

  //COMPANIONS


  println(Person.N_EYES)
  println(Person.canFly)

  //Scala objet = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")

  val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person(mary,john)

  // Scala Applications = scala object with
  // def main(args: Array[String]):Unit

}
