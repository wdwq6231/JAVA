public class Main7_4 {
    public static void main(String[] args) {
        int a = -10;
        System.out.println("abs(-10) = " + Math.abs(a));
        
        int b = 20, c = 15;
        System.out.println("max(20,15) = " + Math.max(b, c));
        System.out.println("min(20,15) = " + Math.min(b, c));
        
        double d = 16;
        System.out.println("sqrt(16) = " + Math.sqrt(d));
        
        double base = 2, exponent = 3;
        System.out.println("pow(2,3) = " + Math.pow(base, exponent));
        
        System.out.println("random() = " + Math.random());
        
        double e = 3.6;
        System.out.println("round(3.6) = " + Math.round(e));
        
        double f = 3.2;
        System.out.println("ceil(3.2) = " + Math.ceil(f));
        System.out.println("floor(3.2) = " + Math.floor(f));
    }
}