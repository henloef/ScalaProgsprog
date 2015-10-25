import exceptions.{NoSufficientFundsException, IllegalAmountException}

class Account(initialBalance: Double, val uid: Int = Bank getUniqueId) {
  var balance: Double = initialBalance
  
  def withdraw(amount: Double): Unit = {
    this.synchronized  { //thread safety
      if (amount > getBalanceAmount) {
        throw new NoSufficientFundsException("Insufficient funds");
      }
      else if (amount < 0) throw new IllegalAmountException("Amount must be positive.")
      balance = balance - amount
    }
  }
  
  def deposit(amount: Double): Unit = {
    this.synchronized {
      if (amount < 0) throw new IllegalAmountException("Amount must be positive.")
      balance = balance + amount
    }
  }
  
  def getBalanceAmount: Double = {
    balance;
  }

}