package t3_while;


//짝수의 합
public class Test2 {
	public static void main(String[] args) {
		
		int i = 0, tot = 0;
		
		while(i<100) {
			i += 2;
			tot += i;
		}
		
		System.out.println("0 ~ 100까지 짝수 더한 수: "+tot);
	}
}
