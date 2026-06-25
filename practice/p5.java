package practice;

public class p5{
	public static void main(String args[]){
		long sum = 0;
		long a = 8;
		for(int i = 1;i <= 9;i++){
			a=a*10+8;
			sum+=a;
		}
		System.out.print(sum+8);
	}
}