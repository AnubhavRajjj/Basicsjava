import java.util.Objects;
import java.util.Scanner;

public class Values {
    String a;
    String b;

    Values(String a,String b){
        this.a=a;
        this.b=b;

        }
        public void m6(){
        if(Objects.equals(a, " ") && Objects.equals(b, " ")){
            System.out.println("No values");
        }
        else{
            System.out.println(a+" , "+b);
        }
    }





    public static void main(String[] args) {
        Values obj=new Values("Anubhav","Smriti");
        obj.m6();
}
}
