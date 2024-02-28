package t3_while;

public class Test1 {
	public static void main(String[] args) {
		
		int i = 0, tot = 0;
		
		while(i<100) {
			i++;
			tot += i;
		}
		
		System.out.println("0 ~ 100까지 더한 수: "+tot);
	}
}
