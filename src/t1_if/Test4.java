package t1_if;

import java.util.Scanner;

//점수를 입력받아 학점을 구해라. 
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char gr;
		
		System.out.print("점수를 입력하세요:");
		int num = sc.nextInt();
		
		if(num >= 90) gr = 'A';
		else if(num >= 80) gr = 'B';
		else if(num >= 70) gr = 'C';
		else if(num >= 60) gr = 'D';
		else  gr = 'F';
		
		System.out.println("정수 "+num+"점은 "+gr+"학점 입니다.");
		
		sc.close();
		
	}
	
}
