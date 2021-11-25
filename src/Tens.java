import java.util.Scanner;

public class Tens {
    int a;



    Tens(){
        Scanner s = new Scanner(System.in);
        a=s.nextInt();


    }
    public void m5(){
        a=a/10;
        System.out.println((a%10));
    }

    public static void main(String[] args) {
        Tens obj =new Tens();
        obj.m5();
    }
}
