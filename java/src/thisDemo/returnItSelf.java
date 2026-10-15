package thisDemo;

public class returnItSelf {
    public static void main(String[] args) {
        Student s1 = new Student();

//        s1.setId(1312);
//        s1.setName("유희성");
//        s1.setGrade(1);

//        Student student1 = s1.setId(1312);
//        Student student2 = student1.setName("유희성");
//        Student student3 = student2.setGrade(1);

//        s1.showStudendInfo();

        // 체이닝 방식
        s1.setId(1312).setName("유희성").setGrade(1).showStudendInfo();
    }
}
