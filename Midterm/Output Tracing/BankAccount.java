class BankAccount {
private String holderName;
private double balance;
private static String bankName;
private static int totalAccounts;
static {
bankName = "SecureBank Ltd.";
totalAccounts = 0;
System.out.println("Static Block: Bank System Loaded");
}
BankAccount(String name, double balance) {
System.out.println("Constructor: Creating Account");
this.holderName = name;
this.balance = balance;
totalAccounts++;
}
public void setBalance(double newBalance) {
System.out.println("setBalance() Called");
this.balance = newBalance;
}
public double getBalance() {
System.out.println("getBalance() Called");
return balance;
}
public static void showBankInfo() {
System.out.println("Bank Name: " + bankName);
System.out.println("Total Accounts: " +
totalAccounts);
}
public void displayAccount() {
System.out.println("Account Holder: " +
holderName);
System.out.println("Balance: " + balance);
System.out.println("Registered Accounts: " +
totalAccounts);
}
}