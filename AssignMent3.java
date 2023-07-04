package assignment.day1.day2;

import java.util.Scanner;

public class AssignMent3 {
	public static void main(String[] args) {
        float Sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        

        int GT = 1;
        for (int i = 1; i < n; i++) {
            GT = GT * (2 * n - 1);
            Sum += GT;
        }
 
        System.out.println("Sum: " + Sum);
        sc.close();
    }
}
