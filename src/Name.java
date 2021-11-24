import java.util.Scanner;

public class Name {
    String a;
    String b;

    Name(){
        Scanner s = new Scanner(System.in);
        a = s.next();
        b = s.next();
    }
    public void m1(){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Name obj = new Name();
        obj.m1();
    }
}
