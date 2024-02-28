package t1_if;

//논리연산자 (!, &&. ||)
public class Test2 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 30, max = -90;

		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}

		System.out.println("수1 :" + num1 + "수 2: " + num2 + "수 3:" + num3 + " max : " + max);

	}
}
