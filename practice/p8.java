package practice;

import java.io.*;
import java.util.*;

public class p8{
	public static void main(String args[]){
		double sum = 0.0;
		Scanner sc = null;
		File file = new File("practice/goods.txt");
		try{
			sc = new Scanner(new FileInputStream(file));
			sc.useDelimiter("[^1234567890.]+");
			while(sc.hasNextDouble()){
				double a = sc.nextDouble();
				System.out.println("a="+a);
				sum += a;
			}
			System.out.print("sum="+sum);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(sc != null){
				sc.close();
			}
		}
	}
}