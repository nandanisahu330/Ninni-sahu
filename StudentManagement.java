package student_management;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	
	    private ArrayList<Student> students;
	    private Scanner scanner;

	    public StudentManagement() {
	        students = new ArrayList<>();
	        scanner = new Scanner(System.in);
	    }

	    // Add a new student
	    public void addStudent() {
	        System.out.print("Enter Student ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        System.out.print("Enter Student Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Student Marks: ");
	        double marks = scanner.nextDouble();

	        students.add(new Student(id, name, marks));
	        System.out.println("Student added successfully!");
	    }

	    // View all students
	    public void viewStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students found!");
	            return;
	        }
	        System.out.println("\nStudent List:");
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }

	    // Update a student
	    public void updateStudent() {
	        System.out.print("Enter Student ID to update: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        for (Student student : students) {
	            if (student.getId() == id) {
	                System.out.print("Enter new Name: ");
	                String name = scanner.nextLine();
	                System.out.print("Enter new Marks: ");
	                double marks = scanner.nextDouble();

	                student.setName(name);
	                student.setMarks(marks);
	                System.out.println("Student updated successfully!");
	                return;
	            }
	        }
	        System.out.println("Student with ID " + id + " not found!");
	    }

	    // Delete a student
	    public void deleteStudent() {
	        System.out.print("Enter Student ID to delete: ");
	        int id = scanner.nextInt();

	        for (int i = 0; i < students.size(); i++) {
	            if (students.get(i).getId() == id) {
	                students.remove(i);
	                System.out.println("Student deleted successfully!");
	                return;
	            }
	        }
	        System.out.println("Student with ID " + id + " not found!");
	    }

	    // Display menu and handle user choices
	    public void menu() {
	        while (true) {
	            System.out.println("\nStudent Management System");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Update Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    viewStudents();
	                    break;
	                case 3:
	                    updateStudent();
	                    break;
	                case 4:
	                    deleteStudent();
	                    break;
	                case 5:
	                    System.out.println("thank you.........");
	                    System.out.println("exiting....try again......");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }

		
	}
