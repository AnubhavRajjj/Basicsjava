public class Patient {
    String patientName;
    double height;
    double weight;
    Patient(String patientName,double height,double weight){
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }
    public double computeBMI(){
        double BMI = weight/(height*height);
        return BMI;
    }

    public static void main(String[] args) {
        Patient obj = new Patient("Harsh",10,80);
        System.out.println(obj.computeBMI());

    }

}
