
object Main extends App {

  def thread(body: =>Unit): Thread = {
      val t = new Thread {
        override def run() = body
      }
      t.start
      t
    }

  val acc = new Account(50000)
  acc.deposit(20)
  acc.withdraw(30)

  println(acc.getBalanceAmount)


  
  // Write a few transaction examples using Threads
  
}