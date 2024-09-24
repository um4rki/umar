package Lesson_9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Umar
 * DateTime: 9/24/2024 10:56 AM
 */
public class StudentService {
    private static List<Student> students = new ArrayList<>();

    public void add(Student student) {
        students.add(student);
        System.out.println("Student added " + student);
    }

    public void updateStudent(String newName, int newAge){
        for (Student student : students) {
            if(student.getFirstName().equals(newName) && student.getAge() == newAge){
                student.setFirstName(newName);
                student.setAge(newAge);
                System.out.println("Student updated " + student);
                return;
            }
        }
        System.out.println("Student topilmadi");
    }

    public void deleteStudent(String studentName){
        students.removeIf(student -> student.getFirstName().equals(studentName));
        System.out.println("Student deleted " + studentName);
    }


    public void searchStudent(String studentFirstName, String studentLastName,String studentHobbies){
        for (Student student : students) {
            if(student.getFirstName().equals(studentFirstName) && student.getLastName().equals(studentLastName)&& student.getHobbies().equals(studentHobbies)){
                System.out.println("Bu student topildi " + student);
                return;
            }
        }
        System.out.println("Student haqida ma'lumot yo'q");
    }
}
