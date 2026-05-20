import java.util.Scanner;

public class Main7_6 {
    public static void main(String[] args) {
        String scoreStr = "数学 87 分, 物理 76 分, 英语 96 分";
        
        Scanner scanner = new Scanner(scoreStr).useDelimiter("[^0-9]+");
        
        int total = 0; 
        int count = 0;  
        
         
        while (scanner.hasNextInt()) {
            int score = scanner.nextInt();
            total += score;
            count++;
        }
        scanner.close();
        
        double average = (double) total / count;
        
        System.out.println("成绩字符串：" + scoreStr);
        System.out.println("总分：" + total + " 分");
        System.out.println("平均分：" + String.format("%.2f", average) + " 分");
    }
}