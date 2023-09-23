import java.util.Scanner;

public class digit {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a 5-digit number: ");

                                int number = sc.nextInt();
                                if (isFiveDigitNumber(number)) {
                                digit(number);
                                }
                                else {
                                System.out.println("Please enter a 5-digit number.");
                                }
}
 private static boolean isFiveDigitNumber(int number) {
 return number >= 10000 && number <= 99999;
}
private static void digit(int number) {
        String numberStr = Integer.toString(number);
        for (int i = 0; i < numberStr.length(); i++) {
              char digit = numberStr.charAt(i);
              System.out.print(digit + " ");
          }
      }
