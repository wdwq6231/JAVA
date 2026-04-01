public class Main2_1 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        for(int i = 1;i <= 10;i++)
        {
            for(int j = 1;j <= i;j++)
            {
                a *= j;
            }
            sum += a;
            a = 1;
        }
        System.out.print("1!+2!+3!+4!+5!+6!+7!+8!+9!+10!=");
        System.out.println(sum);
    }
}
