public class Main {
public static void main(String[] args) {
BankAccount.showBankInfo();
BankAccount a1 = new BankAccount("Arif", 20000);
a1.displayAccount();
BankAccount a2 = new BankAccount("Nadia", 35000);
a2.setBalance(40000);
System.out.println("Nadia's Updated Balance: " +
a2.getBalance());

a2.displayAccount();


BankAccount a3 = new BankAccount("Kamal", 15000);
BankAccount a4 = new BankAccount("Lina", 5000);
BankAccount a5 = new BankAccount("Rafi", 8000);
}
}