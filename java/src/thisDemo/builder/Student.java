package thisDemo.builder;

public class Student {
    private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.grade = builder.grade;
        this.major = builder.major;
        this.phoneNumber = builder.phoneNumber;
    }

    public void showInfo() {
        System.out.println("학번: " + id);
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade);
        System.out.println("전공: " + major);
        System.out.println("전화번호: " + phoneNumber);
    }

    public static class Builder {
        private int id;
        private String name;
        private int grade;
        private String major;
        private String phoneNumber;

        public Builder(int id, String name, int grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getGrade() {
            return grade;
        }

        public Builder setGrade(int grade) {
            this.grade = grade;
            return this;
        }

        public Builder setMajor(String major) {
            this.major = major;
            return this;
        }

        public String getMajor() {
            return major;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public static void main(String[] args) {
        Student student = new Student.Builder(1312, "유희성", 1)
                .setMajor("App Developer")
                .setPhoneNumber("01010101010")
                .build();
        student.showInfo();
    }
}
