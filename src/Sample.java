import java.util.Scanner;

public class Sample {
    String a;

    Sample(){
        Scanner s = new Scanner(System.in);
         a=s.next();
    }
    public void m2(){
        System.out.println("Welcome" +a);
    }

    public static void main(String[] args) {
        Sample obj= new Sample();
        obj.m2();
    }

}
