public class Shape {
    public void draw(){
        System.out.println("Drawing Shape");
    }
    public void erase(){
        System.out.println("Erasing Shape");
    }

    public static void main(String[] args) {
        Shape obj = new Shape();
        Shape obj1 = new Shape();
        obj.draw();
        obj1.erase();
    }
}
