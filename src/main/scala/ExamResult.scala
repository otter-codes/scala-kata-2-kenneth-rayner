object examresults extends App {


  def examResult(args: List[String], answers: List[String]): Int = {

    val c = args.toArray
    val p = answers.toArray
    var result = 0
    for (i <- 0 to c.length - 1) {


      if (p(i) == "") {
        result

      }
      else if
      (c(i).equals(p(i))) {
        result += 4
      }
      else {

        result -= 1

      }

    }
    result
  }
  println(examResult(List("1", "2", "3"), (List("1", "2", "3"))))



}