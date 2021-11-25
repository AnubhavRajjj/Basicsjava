import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;
    int area;

    Rectangle(){
        Scanner s = new Scanner(System.in);
        length = s.nextInt();
        breadth=s.nextInt();

    }

    public void Area(){
        area = (length*breadth);
        System.out.println(area +" "+"meter square");
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.Area();
    }
}