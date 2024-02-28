package t1_if;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// 알고리즘 - 프로그램의 흐름 -> 형식적으로 반복할 수 있는 알고리즘
		// Temp = 임시기억장치

		Scanner sc = new Scanner(System.in);

		int A, B, Temp;

		System.out.print("두 수를 입력하세요(공백으로 구분): ");

		A = sc.nextInt();
		B = sc.nextInt();

		System.out.println("before : A = " + A + ", B = " + B);

		Temp = B;
		B = A;
		A = Temp; // 간단한 섞기 알고리즘 -> easy~

		System.out.println("after : A = " + A + ", B = " + B);

	}
}
