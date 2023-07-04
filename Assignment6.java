package assignment.day1.day2;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        Assignment6 myObj = new Assignment6();

        System.out.print("Số " + n + " trong hệ nhị phân là: ");
        myObj.convertBinary(n);
        scanner.close();
    }

    public void convertBinary(int num) {
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

}
