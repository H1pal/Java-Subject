package thisDemo;

public class Student {
    private int id;
    private String name;
    private int grade;

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getGrade() {
        return grade;
    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public void showStudendInfo() {
        System.out.println("학번: " + id);
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade);
    }
}
