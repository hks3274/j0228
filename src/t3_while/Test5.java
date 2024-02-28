package t3_while;

public class Test5 {
	public static void main(String[] args) {
		
		int i = 0, tot = 0;
		
		while(i<100) {
			i++;
			tot += i;
			
			if(i % 10 == 0) {
				System.out.println((i-9)+"~"+i+"까지 합한 값: "+tot);
				tot = 0;
			}
		}
		
	}
}
