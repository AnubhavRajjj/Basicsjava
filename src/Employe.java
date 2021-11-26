import java.util.Scanner;

public class Employe {
    int salary;
    int hours;

    public void getInfo(int salary, int hours) {
        this.salary=salary;
        this.hours=hours;

    }

    public void AddSal() {
        if (salary <= 500) {
            System.out.println(salary + 10);
        } else {
            System.out.println(salary);
        }

    }
    public void AddWork(){
        if(hours>=6){
            System.out.println(salary+5);
        }
        else{
            System.out.println(salary);
        }
    }

    public static void main(String[] args) {
        Employe obj =new Employe();
        obj.getInfo(100,1);
        obj.AddSal();
        obj.AddWork();
    }
}