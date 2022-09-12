object Q3 extends App{

  val acc1= new BankAccount("Kamal", 10001, 10000.00)
  val acc2= new BankAccount("Nimal", 10002, 5000.00)

  acc1.transfer(acc2, 3000.00)
  println("Balance after the transfer")
  println(acc1)
  println(acc2)

}

class BankAccount(ID:String, account:Int, bal:Double){

  var id:String = ID
  var ac_no:Int = account
  var balance:Double = bal

  def withdraw(amount:Double) = {
    this.balance = this.balance-amount
  }

  def deposit(amount:Double) = {
    this.balance = this.balance+amount
  }

  def transfer(acc:BankAccount, amount:Double) = {
    this.withdraw(amount)
    acc.deposit(amount)
  }

  override def toString = id +" : "+ac_no+" : "+balance

}