package OOpsInKotlin.Encapsulation;

 class BankAccount {
     private double balance;
     private String accountNumber;

     public void depositFirst(double amount) {
         if (amount > 0) balance += amount;
     }

     public double getBalanceFirst() {
         return balance;
     }


     public BankAccount(){}

         public BankAccount(String accountNumber, double initialBalance) {
             this.accountNumber = accountNumber;
             this.balance = initialBalance;
         }

         public void deposit(double amount) {
             if (amount > 0) {
                 balance += amount;
                 System.out.println("Deposited: $" + amount);
             } else {
                 System.out.println("Invalid deposit amount");
             }
         }

         public boolean withdraw(double amount) {
             if (amount > 0 && amount <= balance) {
                 balance -= amount;
                 System.out.println("Withdrawn: $" + amount);
                 return true;
             } else {
                 System.out.println("Insufficient funds or invalid amount");
                 return false;
             }
         }

         public double getBalance() {
             return balance;
         }

         public String getAccountNumber() {
             return accountNumber;
         }

}
