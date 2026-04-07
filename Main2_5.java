public class Main2_5 {
    public static void main(String[] args) {
        long sum=0;
        long a=8;
        for(int i=1;i<=10;i++){
            sum+=a;
            a=a*10+8;
        }
        System.out.println(sum);
    }
}
