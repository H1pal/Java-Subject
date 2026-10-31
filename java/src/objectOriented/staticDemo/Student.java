package objectOriented.staticDemo;

public class Student {
    public static int serialNum = 1300;

    private int studentId;
    private String studentName;
    private int grade;
    private String address;

    public Student() {
        studentId = ++serialNum; // serialNum은 모든 객체가 공유하는 클래스 변수 이므로 studentId의 값을 복사
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }
}
