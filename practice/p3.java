package practice;

public class p3 {
	public static void  main(String[] args){
		double sum = 0.0;
		int a=1;
		for(int i = 1; i <= 20;i++){
			a*=i;
			sum+=(1.0/a);
		}
		System.out.println(sum);
	}
}