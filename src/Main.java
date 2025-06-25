import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement manager = new StudentManagement();
        int choice;

        do {

            System.out.println("Welcome to Student Management System");

            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name : ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks : ");
                    double marks = scanner.nextDouble();
                    manager.addStudent(new Student(id, name, marks));
                    break;
                }

                case 2 -> manager.viewStudent();

                case 3 -> {
                    System.out.print("Enter Student ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name : ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter Marks : ");
                    double newMarks = scanner.nextDouble();

                    manager.updateStudent(id, newName, newMarks);
                }

                case 4 -> {
                    System.out.print("Enter Student Id :");
                    int id = scanner.nextInt();

                    manager.deleteStudent(id);
                }

            }

        } while (choice != 5);

    }
}