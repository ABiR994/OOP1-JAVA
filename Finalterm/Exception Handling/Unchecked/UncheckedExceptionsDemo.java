public class UncheckedExceptionsDemo {
    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } 
		catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // 2. NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } 
		catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int num = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // 4. StringIndexOutOfBoundsException
        try {
            String s = "Hello";
            char ch = s.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // 5. NumberFormatException
        try {
            String strNum = "abc";
            int number = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        System.out.println("Program finished without crashing!");
    }
}
