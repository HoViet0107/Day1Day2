package assignment.day1.day2;

import java.util.Scanner;

public class Assignment7 {
	
    static void DemKyTu(String str) {
        int[] counter = new int[256];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            counter[c]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                char c = (char) i;
                System.out.println("Số lần xuất hiện của " + c + " trong chuỗi: " + counter[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = scanner.next();
        int len = str.length();

        StringBuilder strArr = new StringBuilder(str).reverse();

        System.out.println("Chuỗi đảo ngược: " + strArr.toString());
        System.out.println("Chuỗi in hoa: " + str.toUpperCase());
        System.out.println("Chuỗi viết thường: " + str.toLowerCase());
        DemKyTu(str);

        System.out.print("Nhập giá trị của n: ");
        int n = scanner.nextInt();
        System.out.print("Nhập giá trị của m: ");
        int m = scanner.nextInt();
        if (n >= len || m >= len) {
            System.out.println("Giá trị n hoặc m vượt quá độ dài của chuỗi.");
        } else {
            String subString = str.substring(n, m + 1);
            System.out.println("Chuỗi con của S từ kí tự thứ " + n + " đến thứ " + m + ": " + subString);
        }

        scanner.close();

    }

}
