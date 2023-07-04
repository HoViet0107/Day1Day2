package assignment.day1.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Assingment8 {

	public static int SumPositiveOdd(int[] a, int len) {
		int S = 0;

		for (int i = 0; i < len; i++)
			if (a[i] % 2 != 0)
				S += a[i];

		return S;
	}

	public static int[] FindK(int[] a, int k, int len) {
		boolean isVisible = false;

		int count = 0;
		// tính độ dài mảng vị trí của k
		for (int i = 0; i < len; i++)
			if (a[i] == k)
				count++;

		int[] pos = new int[count];
		int index = 0;

		for (int i = 0; i < len; i++) {
			if (a[i] == k) {
				isVisible = true;
				pos[index] = i;
				index++;
			}
		}

		if (!isVisible) {
			System.out.println(k + " không tồn tại trong mảng");
		}
		return pos;
	}

	public static int[] SortArr(int[] a, int len) {
		int temp;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static int[] InserK(int[] a, int k, int len) {
		int[] newA = new int[len + 1];
		int index = 0;

		for (int i = 0; i < len; i++) {
			if (a[i] < k) {
				newA[index] = a[i];
				index++;
			} else {
				break;
			}
		}
		newA[index] = k;
		index += 1;
		for (int i = index; i < newA.length; i++) {
			newA[index] = a[index - 1];
			index++;
		}
		return newA;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();

		int[] a = new int[n];

		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();
		}
		// int[] a = { 1, 4, 6, 2, 6, 3, 8, 5, 9 };
		System.out.print("Nhập số k cần tìm trong mảng: ");
		int k = scanner.nextInt();

		int len = a.length;

		System.out.println("Tổng các số lẻ trong mảng: " + SumPositiveOdd(a, len));
		System.out.println("Vị trí của " + k + " trong mảng" + Arrays.toString(FindK(a, k, len)));
		System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(SortArr(a, len)));

		System.out.print("Nhập phần tử x cần chèn: ");
		int x = scanner.nextInt();
		System.out.println("Mảng sau chi chèn " + x + " là: " + Arrays.toString(InserK(a, x, len)));

		scanner.close();
	}
}
