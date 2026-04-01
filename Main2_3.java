public class Main2_3 {
    public static void main(String[] args) {
        double sum=0;
        int a=1;
        for(int i=1;i<=20;i++){
            for(int j=1;j<=i;j++){
                a*=j;
            }
            sum+=1.0/a;
            a=1;
        }
        System.out.println("1+1/2!+...+1/20!="+sum);
        
        int i=1;
        sum=0;
        a=1;
        do{
            a*=i;
            sum+=1.0/a;
            i++;
        }while(i<=20);
        System.out.println("1+1/2!+...+1/20!="+sum);
    }
}
