public class Main2_2 {
    public static void main(String[] args) {
        int flag=1;
        System.out.print("2");
        for(int i=3;i<=100;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(' ');
                System.out.print(i);
            }
            flag=1;
        }
        System.out.println(' ');
    }
}