package array.arrayList.assignments.assignment02;

public class Student {
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.printf("학번: %d, 이름: %s\n", number, name);
    }
}
