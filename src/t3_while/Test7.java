package t3_while;

public class Test7 {
	public static void main(String[] args) {
		
		int i = 0, odd = 0, even =0, sw =0;
		
		while(i<100) {
			i++;
			
			if(sw == 0) { //switching 기법을 활용
				odd += i;
				sw =1;
			}else {
				even += i;
				sw = 0;
			}
			
		}
		
		System.out.println(odd+", "+even);
	}
}
