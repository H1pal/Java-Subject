package array.arrayList.assignments.assignment01;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("멍멍이", "치와와");
        dogs[1] = new Dog("뽀삐", "진돗개");
        dogs[2] = new Dog("순심이", "삽살개");
        dogs[3] = new Dog("철이", "마르티스");
        dogs[4] = new Dog("삐쭈", "푸들");

        for (Dog dog: dogs) {
            dog.showDogInfo();
        }
    }
}
