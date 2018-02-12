
import scala.io.StdIn

object examresults extends App {


  def examResult(args: List[String], answers: List[String]): String = {


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
    s"Your mark in th exam is $result"
  }

  val numQuestions = scala.io.StdIn.readLine("Enter how many questions are in the test").toInt

    val pupilsAnswers = (1 to numQuestions).map(_ => scala.io.StdIn.readLine (s"Enter answer:  " )).toList


    val correctAnswers = (1 to numQuestions).map(_ => scala.io.StdIn.readLine(s"Enter correct answer")).toList


println(pupilsAnswers)
  println(correctAnswers)
    println(examResult(correctAnswers, pupilsAnswers))



}
