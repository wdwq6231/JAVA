public class Main7_1 {
    public static void main(String[] args) {
        String originalStr = "Hello";
        
        String upperStr = originalStr.toUpperCase();
        System.out.println("原字符串：" + originalStr);
        System.out.println("转大写后：" + upperStr);
        
        String lowerStr = originalStr.toLowerCase();
        System.out.println("转小写后：" + lowerStr);

        String suffix = " Hi";
        String concatStr = originalStr.concat(suffix);
        System.out.println("拼接后：" + concatStr);
        
        System.out.println("验证原字符串未改变：" + originalStr);
    }
}
