public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Animesh", 28);
        // s1.name= "Animesh";
        // s1.age= 28;
        System.out.println("Name: " + s1.name + " " + "Age: " + s1.age);

        Student s2 = new Student("Roshan", 25);
       // s2.name= "Roshan";
        // s2.age= 25;
        System.out.println("Name: " + s2.name + " " + "Age: " + s2.age);

    }
}


