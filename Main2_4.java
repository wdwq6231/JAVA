public class Main2_4 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=1000;i++){
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum == i){
                System.out.print(i);
                System.out.print(' ');
            }
            sum = 0;
        }
        System.out.println(' ');
    }
}
