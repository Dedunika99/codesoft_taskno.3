
package atm.machine;


public class BankAccount {
  private double balance;

  BankAccount(double balance){
    this.balance=balance;
}  
  public double getBalance(){
      return balance;
  }
  public int deposit(double amount){
      if(this.balance<amount){
          return 0;
      }
      else{
          this.balance=balance+amount;
          return 1;
      }
  }
  public double withdraw(double amount){
      if (balance>=amount){
          this.balance=balance -amount;
          return 1;
      }
      else{
          return 0;
      }
      
  }
}

