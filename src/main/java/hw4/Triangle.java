package hw4;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;
@Data
@NoArgsConstructor
public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int calculateArea() {
        checkSidesArePositive();
        checkValid();
        double p1 = (a + b + c) / 2.0;
        return (int) Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
    }

    private void checkValid() {
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalArgumentException("The sides do not form a triangle");
        }
    }
    private void checkSidesArePositive() {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("The sides must be positive");
        }
    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("a= ");
//        int a = scan.nextInt();
//        System.out.print("b= ");
//        int b = scan.nextInt();
//        System.out.print("c= ");
//        int c = scan.nextInt();
//        if (a + b < c || a + c < b || b + c < a) {
//            throw new IllegalArgumentException("The sides do not form a triangle");
//        }
//        if (a <= 0 || b <= 0 || c <= 0){
//            throw new IllegalArgumentException("The sides must be positive");
//        }
//        double p1 = (a + b + c) / 2.0;
//        System.out.println("Area:" + Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c)));
//    }
}
