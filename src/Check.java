import java.util.Scanner;

public class Check {
    int a;
    int b;

    Check() {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
    }

    public void m4() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Check obj =new Check();
        obj.m4();
    }
}
