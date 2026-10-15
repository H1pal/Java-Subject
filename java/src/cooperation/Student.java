package cooperation;

public class Student {
    private int money;
    private String studentName;
    private int grade;

    public Student(String studentName, int money) {
        this.money = money;
        this.studentName = studentName;
    }

    public void takeBus(Bus bus) {
        // 버스가 승객을 태우는 메서드
        bus.takePassenger();
        money -= 1100;
    }

    public void takeSubway(Subway subway) {
        // 지하철이 승객을 태우는 메서드
        subway.takePassenger();
        money -= 850;
    }

    public void showInfo() {
        System.out.printf("%s님의 남은 돈은 %d입니다.\n", studentName, money);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
