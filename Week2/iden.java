import java.util.*;

public class iden.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cntPos = 0;
        int cntNeg = 0;
        int cntZero = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            if (number > 0) {
                cntPos++;
            } else if (number < 0) {
                cntNeg++;
            } else {
                cntZero++;
            }
        }

        System.out.println("Number of positive numbers: " + cntPos);
        System.out.println("Number of negative numbers: " + cntNeg);
        System.out.println("Number of zeros: " + cntZero);
    }
}
