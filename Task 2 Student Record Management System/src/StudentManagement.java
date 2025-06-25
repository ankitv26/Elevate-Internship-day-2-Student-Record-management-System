import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student Added");
    }

    public void viewStudent() {
        if (studentList.isEmpty()) {
            System.out.println("Student not found");
            return;
        }

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void updateStudent(int id, String newName, double newMarks) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setMarks(newMarks);
                System.out.println("Student update Successfully");
                return;
            }
        }
        System.out.println("Student with id : " + id + " not found");
    }

    public void deleteStudent(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("Student deleted");
                return;
            }
        }
        System.out.println("Student with Id : " + id + " not found");
    }

}
