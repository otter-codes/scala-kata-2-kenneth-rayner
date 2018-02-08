
  package scala.CollatzConjecture

  import scala.io.StdIn


  object Collatz extends App{


    def collatz(n: Int, count : Int = 0): Int = {

      if (n == 1) {

        count + 1

      } else {
        if (n % 2 == 0) collatz(n / 2, count + 1)

        else collatz(3 *n + 1,count+1)

      }
    }

    val num = StdIn.readLine("Enter a number: ").toInt


    println("The length of the Collatz Conjecture sequence is " +collatz(num))

  }
