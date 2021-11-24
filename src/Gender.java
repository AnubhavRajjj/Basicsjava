import java.util.Objects;
import java.util.Scanner;

public class Gender {
    String gender;
    int age;

    Gender(){
        Scanner s = new Scanner(System.in);
        gender = s.next();
        age = s.nextInt();
    }
    public void m3(){
        if(Objects.equals(gender, "female") && (age>=1) && (age<=58)){
        System.out.println("Interest is 8.2%");

    }
        else if(Objects.equals(gender, "female") && (age>=59)&&(age<=100)){
            System.out.println("Interest is 9.2%");
        }
        else if(Objects.equals(gender, "male")&& (age>=1)&&(age <=58)){
            System.out.println("Interest is 8.4%");


        }
        else{
            System.out.println("Interest is 10.5%");
        }


        }

    public static void main(String[] args) {
        Gender obj =new Gender();
        obj.m3();
    }

        }

