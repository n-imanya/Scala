object Q4 extends App {

  val acc1 = new BankAccount("Kamal", 10001, 10000.00)
  val acc2 = new BankAccount("Nimal", 10002, 5000.00)
  val acc3 = new BankAccount("Sunil", 10003, 2000.00)
  val acc4 = new BankAccount("Nayana", 10004, -3000.00)

  var bank:List[BankAccount] = List(acc1, acc2, acc3, acc4)

  val negbalance = bank.filter(a => a.balance<0)
  val totbalance = bank.map((a) => (a.balance)).reduce((a,b) => (a+b))

  val interest = (b:List[BankAccount]) => 
  b.map((a) => (a.id, a.ac_no,
  if (a.balance>0) (a.balance + (a.balance*0.05)) 
  else (a.balance + (a.balance*0.1))))

  println("Accounts with negative balance: "+negbalance)
  println("Sum of all account balances: "+totbalance)
  println("Final balances with interest: "+ interest(bank))

}

class BankAccount(ID:String, account:Int, bal:Double){

  var id:String = ID
  var ac_no:Int = account
  var balance:Double = bal

  override def toString = id+" : "+ac_no+" : "+balance

}
