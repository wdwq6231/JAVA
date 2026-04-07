public class Main2_6 {
    public static void main(String[] args) {
        int sum=0;
        int x=0;
        for(int i=1;i<8888;i++){
            sum+=i;
            if(sum>8888){
                x=i-1;
                break;
            }
        }
        System.out.println(x);
    }
}
