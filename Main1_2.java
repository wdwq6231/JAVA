public class Main1_2 {
    public static void main(String[] args) {
        System.out.print("大写希腊字母：");
        for(char c='\u0391';c<='\u03A9';c++)
        {
            System.out.print(c);
        }
        
        System.out.println(' ');

        System.out.print("小写希腊字母：");
        for(char c='\u03B1';c<='\u03C9';c++)
        {
            System.out.print(c);
        }
        System.out.println(' ');
    }
}
