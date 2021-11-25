import java.util.Scanner;

public class Employee {
    String name;
    int year;
    String address;

    Employee(){
        Scanner s = new Scanner(System.in);
        name=s.next();
        year=s.nextInt();
        address=s.next();
        }
        public void m1(){
            System.out.println(name +" "+year+" "+address);

        }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.m1();
    }

    }

