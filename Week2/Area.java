import java.util.*;
class Area{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter radius of circle");
                int r = sc.nextInt();
                float pi = 3.14159f;
                int dm = 2*r;
                float cm = 2*pi*r;
                float area = pi*r*r;
                System.out.println("Diameter of Circle is : " + dm);
                System.out.println("Circumfrence of the circle is : " + cm);
                System.out.println("Area of the circle is : " + area);
        }
}
