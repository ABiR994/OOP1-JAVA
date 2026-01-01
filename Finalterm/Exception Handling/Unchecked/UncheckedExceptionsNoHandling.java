public class UncheckedExceptionsNoHandling {
    public static void main(String[] args) {
                  System.out.println("Program started!");
        // 1. ArithmeticException
			int a = 10;
        int b = 0;
        int c = a / b;

        // 2. NullPointerException
        String str = null;
        System.out.println(str.length());

        // 3. ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        int num = arr[5];

        // 4. StringIndexOutOfBoundsException
        String s = "Hello";
        char ch = s.charAt(10);

        // 5. NumberFormatException
        String strNum = "abc";
        int number = Integer.parseInt(strNum);

        System.out.println("Program finished!");
    }
}
