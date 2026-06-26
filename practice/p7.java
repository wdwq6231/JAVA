package practice;

import java.io.*;
import java.util.*;

public class p7{
	public static void main(String[] args){
		String str = "practice/str.txt";
		String der = "practice/der.txt";
		String a = null;
		int num = 1;
		try(BufferedReader red = new BufferedReader(new FileReader(str));
		BufferedWriter wri = new BufferedWriter(new FileWriter(der))){
			while((a = red.readLine()) != null){
				String outs = num + ":" + a;
				wri.write(outs);
                wri.newLine();
				num++;
			}
			System.out.print("已完成");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}