// 导入输入工具
import java.util.Scanner;

// 主类（文件名必须是 Main.java）
public class Main {
    public static void main(String[] args) {
        // 创建输入对象
        Scanner sc = new Scanner(System.in);
        
        // 提示用户输入
        System.out.print("请输入一个数字：");
        
        // 读取输入的数字
        int num = sc.nextInt();
        
        // 输出数字本身
        System.out.println("你输入的数字是：" + num);
        
        System.out.println("你输入的数字是：" + num);
        System.out.println("你输入的数字是：" + num);
        // 关闭输入
        sc.close();
    }
}