package practice;

public class p2{
	public static void main(String[] args){
		boolean a = true;
		System.out.print("2 ");
		for(int i = 3;i <= 100;i++){
			for(int j = 2;j < i;j++){
				if(i % j==0){
					a = false;
				}
			}
			if(a == false){
				a = true;
			}
			else{
				System.out.print(i+" ");
			}
		}
	}
}
