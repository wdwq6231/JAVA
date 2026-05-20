public class Main7_5 {
    public static void main(String[] args) {
        String original = "ab123you";
        
        String digitStr1 = original.replaceAll("[^0-9]", "");
        System.out.println("原字符串：" + original);
        System.out.println("去除非数字后（正则方法）：" + digitStr1);
    }
}
