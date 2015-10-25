import exceptions.IllegalAmountException

object Bank {
  
  private var idCounter: Int = 0
  
  def transaction(from: Account, to: Account, amount: Double): Unit = {
    if(from.getBalanceAmount > amount){
      throw new IllegalAmountException("Insufficient funds")
    }
    else {
      from.withdraw(amount)
      to.deposit(amount)
    }

  } //Implement
  
  def getUniqueId: Int = {
    idCounter += 1
    idCounter
  }
  
}