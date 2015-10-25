import exceptions.{NoSufficientFundsException, IllegalAmountException}

object Bank {
  
  private var idCounter: Int = 0
  
  def transaction(from: Account, to: Account, amount: Double): Unit = {
    if(from.getBalanceAmount < amount){
      throw new NoSufficientFundsException("Insufficient funds")
    }
    else if(amount <= 0){
      throw new IllegalAmountException("blbk")
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