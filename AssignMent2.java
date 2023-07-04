package assignment.day1.day2;

import java.util.Scanner;

public class AssignMent2 {
	public static void main(String[] args) {

		float S = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			S += (1.0 / i);
		}
		System.out.println("Sum: " + S);

		sc.close();
	}
}
