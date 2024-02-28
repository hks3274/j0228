package t1_if;
import java.util.Scanner;

//세과목의 점수를 입력받는다. 이때 3과목의 점수가 평균점수가 60범 이상이고, 각 과목단 40점 이상이면 '합격', 아니면 '과락'
public class Test3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1,su2,su3, avg;
		String str = "";
		
		System.out.print("첫번째 과목의 점수는?"); su1 = sc.nextInt();
		System.out.print("두번째 과목의 점수는?"); su2 = sc.nextInt();
		System.out.print("세번째 과목의 점수는?"); su3 = sc.nextInt();
		
		
		avg = (su1+su2+su3)/3;
		
		if(avg < 60 || su1 < 40 || su2 < 40 || su3 < 40) str = "불합격"; //시간복잡도(*) -> 가장 중요하다!!
		else str = "합격";
		
		System.out.println(str); 
		
		sc.close();
	}
}
