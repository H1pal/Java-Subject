package objectOriented.staticDemo;

public class StudentTest {
    public static void main(String[] args) {
        Student studentPark = new Student();
        studentPark.setStudentName("나는야 박준민");

        Student studentShin = new Student();
        studentShin.setStudentName("신지호");

        System.out.println(studentPark.getStudentName() + ": " + studentPark.getStudentId());
//        System.out.println(studentPark.getStudentName() + ": " + studentPark.serialNum);
//        studentPark.serialNum++;

        System.out.println(studentShin.getStudentName() + ": " + studentShin.getStudentId());
//        System.out.println(studentShin.getStudentName() + ": " +  studentPark.serialNum);
//        studentShin.serialNum++;

        System.out.println(studentPark.getStudentName() + ": " + studentPark.getStudentId());
//        System.out.println(studentPark.getStudentName() + ": " + studentPark.serialNum);

        System.out.println(studentPark.serialNum);
        System.out.println(Student.serialNum);
    }
}
