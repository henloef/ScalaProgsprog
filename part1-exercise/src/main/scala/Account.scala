import exceptions.{NoSufficientFundsException, IllegalAmountException}

class Account(initialBalance: Double, val uid: Int = Bank getUniqueId) {
  var balance: Double = initialBalance
  
  def withdraw(amount: Double): Unit = {
    if(amount > getBalanceAmount){
      throw new NoSufficientFundsException();
    }
    else if(amount < 0){
      throw new IllegalAmountException()
    }
    balance = balance - amount
  } //Implement
  
  def deposit(amount: Double): Unit = {
    if(amount <= 0){
      throw new IllegalAmountException("Bullshit")
    }
    balance = balance + amount
  } //Implement
  
  def getBalanceAmount: Double = {
    return balance;
  }//Implement

}