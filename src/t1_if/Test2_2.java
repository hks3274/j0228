package t1_if;

import java.lang.reflect.Array;

//논리연산자 (!, &&. ||)
public class Test2_2 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 15, max = -90;
		
		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		
		System.out.println("수1:" + num1 + ", 수2:" + num2 + ", 수3:" + num3 + ", max:" + max);

	}
}
