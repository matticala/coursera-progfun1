package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r -1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      @tailrec
      def fn(chars: List[Char], open: Int): Boolean = {
        if(chars.isEmpty) open == 0
        else if ('(' == chars.head) fn(chars.tail, open + 1)
        else if (')' == chars.head) { if(open > 0) fn(chars.tail, open - 1) else false }
        else fn(chars.tail, open)
      }
      fn(chars, 0)
    }
  
  /**
   * Exercise 3
    *
    * Write a recursive function that counts how many different ways you can make change for an amount,
    * given a list of coin denominations. For example, there are 3 ways to give change for 4 if you
    * have coins with denomiation 1 and 2: 1+1+1+1, 1+1+2, 2+2.
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0 && coins.isEmpty) 1
      else if (money == 0 || coins.isEmpty) 0
      else {
        ???
      }
    }
  }
