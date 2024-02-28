package t2_switch_case;

import java.util.Scanner;

//직급코드를 입력받아서 직급별 명칭을 입력하시오.
/*
 <직급코드>
 1: 부장, 본봉: 5000000
 2: 과장, 본봉: 4000000
 3: 대리, 본봉: 3000000
 4: 사원, 본봉: 2000000
 
 
 시간수당(sudang) : 시간을 입력받아서 1시간당 25000원으로 계산 한다.
 공제액(gongje) : (본봉(bonbong)+ 수당)의 10%로 한다.
 실수령액(netpay)을 구하시오.
 단, 실수령액 = 본봉 + 수당 - 공제액
*/

public class Test5_3 {
	public static void main(String[] args) {
		
		String jik = "";
		int code = 0, bonbong = 0, sudang = 0, netpay = 0, gongje = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직급코드를 입력하세요(1: 부장, 2.과장, 3:대리, 4:사원): ");
		code = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("초과 시간을 입력하세요 : ");
		sudang = sc1.nextInt();
		
		switch(code) { //문자, 문자열, 정수만 가능
			case 1: 
				jik = "부장"; 
				bonbong = 5000000; 
				break;
			case 2:
				jik = "과장";
				bonbong = 400000;
				break;
			case 3:
				jik = "대리";
				bonbong = 3000000;
				break;
			case 4:
				jik = "사원";
				bonbong = 2000000;
				break;
			default:
				jik = "비사원";
				bonbong = 0;
				sudang = 0;
		}
		
		sudang = sudang * 25000;
		gongje = (int)((bonbong + sudang) * 0.1);
		netpay = bonbong + sudang - gongje;
		
		System.out.println("직급코드 "+code+"는(은) "+jik+"직급 입니다." );
		System.out.println("본봉: "+bonbong+"원, 수당: "+sudang+"원, 공제: "+gongje+"원, 실수령액: "+netpay+"원 입니다.");
		
		sc.close();
		
	}
}
