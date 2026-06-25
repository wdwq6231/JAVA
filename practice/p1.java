package practice;

public class p1{
	public static void main(String[] args){
		long sum=0;
		int a=1;
		for(int i = 1;i <= 10;i++){
			for(int j = 1;j <= i;j++){
				a*=j;
			}				
			sum+=a;
			a=1;
		}
		System.out.println(sum);
	}
}