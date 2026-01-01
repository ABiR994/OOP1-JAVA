public class Main {
    public static void main(String[] args) {
        FixedAccount fa1 = new FixedAccount("FA-001", 20000);
		
        //fa1.setAccNo("Fa-101"); error
		fa1.setBalance (50000);
		
        System.out.println("Account: " + fa1.getAccNo() + ", Balance: " + fa1.getBalance());
        FixedAccount fa2 = new FixedAccount("FA-005", 20000);
        

    }
}