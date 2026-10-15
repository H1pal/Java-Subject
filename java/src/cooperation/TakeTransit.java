package cooperation;

public class TakeTransit {
    public static void main(String[] args) {
        Student studentYu = new Student("유희성", 60000);
        Student studentPal = new Student("유희팔", 10000);

        Bus busA = new Bus(470);
        Subway subwayA = new Subway(2);

        studentYu.takeBus(busA);
        studentPal.takeSubway(subwayA);

        studentYu.showInfo();
        studentPal.showInfo();

        studentYu.takeSubway(subwayA);
        studentYu.showInfo();
    }
}
