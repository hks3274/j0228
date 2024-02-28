package t2_switch_case;

import java.util.Scanner;

//점수를 입력받아 학점을 구해라. 
public class Test4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char gr;
		
		System.out.print("점수를 입력하세요:");
		int num = sc.nextInt();
		
		
		switch (num/10) {
			case 10:
			case 9:
				gr = 'A';
				break;
			case 8:
				gr = 'B';
				break;
			case 7:
				gr = 'C';
				break;
			case 6:
				gr = 'D';
				break;
			default:
				gr = 'F';
				break;
		}
		
		System.out.println("정수 "+num+"점은 "+gr+"학점 입니다.");
		
		sc.close();
		
	}
}
