package assignment.day1.day2;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		String n = sc.next();
		int S = 0;
		int P = 1;

		for (String i : n.split("")) {
			int num = Integer.parseInt(i);
			S += num;
			P *= num;
		}
		System.out.println("Tổng S: " + S);
		System.out.println("Tích P: " + P);

		sc.close();
	}

}
