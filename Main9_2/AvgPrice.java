package Main9_2;

import java.io.*;
import java.util.*;

public class AvgPrice {
    public static void main(String args[]) {
        File file = new File("Main9_2/goods.txt");
        Scanner sc = null;
        int count = 0;       
        double sum = 0.0; 
        try {
            sc = new Scanner(file);
            sc.useDelimiter("[^0123456789.]+");
            while(sc.hasNextDouble()){
                double price = sc.nextDouble();
                count++;
                sum += price;
                System.out.println("提取到价格："+price);
            }
            double avg = sum / count;
            String res = String.format("%.3f",avg);
            System.out.println("商品平均价格："+res);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(sc != null) sc.close();
        }
    }
}
