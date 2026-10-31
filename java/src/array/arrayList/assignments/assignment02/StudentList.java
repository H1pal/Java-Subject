package array.arrayList.assignments.assignment02;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        String[] name = {"강하늘", "김도영", "박영현", "안세영", "우상혁", "최인호"};

        int i = 1101;
        ArrayList<Student> students = new ArrayList<>();

        for (String n: name) {
            students.add(new Student(i++, n));
        }

        for (Student student: students) student.showStudentInfo();
    }
}
