public class Students extends Person{
    int studentId;

    public Students(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    public void printDetails() {
        super.printDetails();
        System.out.println("Id " + studentId);
    }

    public static void main(String[] args) {
    Students s1 = new Students("Animesh", 28, 1);
    s1.printDetails();



    }
}
