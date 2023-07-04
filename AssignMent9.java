package assignment.day1.day2;

import java.util.Scanner;

public class AssignMent9 {

    public static void main(String[] args) {
        // int[][] maTran = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số dòng (m): ");
        int m = sc.nextInt();

        System.out.print("Nhập số cột (n): ");
        int n = sc.nextInt();

        int[][] maTran = new int[m][n];
        // nhập ma trận
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử [" + i + "]" + "[" + j + "]: ");
                maTran[i][j] = sc.nextInt();
            }
        }
        // in ma trận
        System.out.println("Ma trận A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(maTran[i][j] + " ");
            }
            System.out.println();
        }

        // tích các số là bội số của 3 hàng đầu tiên của ma trận
        int Tich = 1;

        for (int i = 0; i < n; i++) {
            if (maTran[0][i] % 3 == 0) {
                Tich *= maTran[0][i];
            }
        }
        System.out.println("Tích bội số của 3 dòng đầu tiên ma trận: " + Tich);

        // mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma
        // trận A

        int[] X = new int[m];
        int max = 0;
        for (int i = 0; i < m; i++) {
            max = maTran[i][0];
            for (int j = 0; j < n; j++) {
                if (max < maTran[i][j])
                    max = maTran[i][j];
            }
            X[i] = max;
        }

        System.out.print("Các giá trị lớn nhất trên từng dòng của ma trận: ");
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i] + " ");
        }
        sc.close();
    }
}
