package assignment.day1.day2;

import java.util.Scanner;

public class Assignment5 {

    public static int timUSCLN(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
            System.out.println(b);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        int uscln = timUSCLN(a, b);
        int bscnn = (a * b) / uscln;

        System.out.println("Ước số chung lớn nhất (USCLN) của " + a + " và " + b + " là: " + uscln);
        System.out.println("Bội số chung nhỏ nhất (BSCNN) của " + a + " và " + b + " là: " + bscnn);
        scanner.close();
    }

}
