public class Main7_2 {
    public static void main(String[] args) {
        String str = "Hello";
        
        char firstChar = str.charAt(0);
        System.out.println("字符串：" + str);
        System.out.println("第一个字符：" + firstChar);
        
        int lastIndex = str.length() - 1;
        char lastChar = str.charAt(lastIndex);
        System.out.println("最后一个字符：" + lastChar);
    }
}
