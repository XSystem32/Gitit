import java.util.ArrayList;

public class School {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {


        Student student = new Student();
        addStudent("Boris", 18, "something@gmail.com");
    }
    private static void addStudent(String name, int age, String email){
        System.out.println("add student was called");
        students.add()
    }
}

