import java.util.*;
public class snc {
    public static void main(String[] args) {
        System.out.println("Number | Square | Cube");

        for (int i = 0; i <= 10; i++) {
        int square = i * i;
        int cube = i * i * i;
        System.out.printf("%6d | %6d | %4d%n", i, square, cube);
        }
    }
}
