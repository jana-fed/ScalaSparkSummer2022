object Day4CollectExercise extends App {
  println("Day 4 Exercise on Partial Functions and collect")
  //TODO write two partial functions


  val getEvenSquare = new PartialFunction[Int, Int] {
    def apply(n: Int): Int = Math.pow(n,2).toInt//so what to do
    def isDefinedAt(n: Int): Boolean = n > 0 && n%2 == 0 //what is not acceptable
  }

  val getOddCube = new PartialFunction[Int, Int] {
    def apply(n: Int): Int = Math.pow(n,3).toInt //so what to do
    def isDefinedAt(n: Int): Boolean = n > 0 && n%2 != 0//what is not acceptable
  }
  //getEvenSquare applies to only positive even numbers  -> returns square
  //getOddCube applies to only positive odd numbers -> returns cube
  //combine both partial functions into a single partial function
  //doPositives will work on positive numbers
  val doPositives = getEvenSquare orElse getOddCube
  val numbers = (-5 to 28).toArray

  val processedNumbers = numbers.collect(doPositives)
//  println(numbers.collect(getEvenSquare).mkString(","))
//  println(numbers.collect(getOddCube).mkString(","))
  println(processedNumbers.mkString(","))
  //using collect get the new values into
  //TODO
  //val processedNumbers =
  //println the results
}

