package assignment.day1.day2;

import java.util.Scanner;

public class Assignment7 {
	
    static void DemKyTu(String str) {
        int counter[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
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
