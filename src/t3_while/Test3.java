package t3_while;


//홀수의 합
public class Test3 {
	public static void main(String[] args) {
		
		int i = -1, tot = 0;
		
		while(i<99) { //99일때 빠져나감
			i += 2;
			tot += i;
		}
		
		System.out.println("0 ~ 100까지 홀수 더한 수: "+tot);
	}
}
