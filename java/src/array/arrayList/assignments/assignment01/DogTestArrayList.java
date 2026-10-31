package array.arrayList.assignments.assignment01;

/*
조건 - add() 메서드를 사용하여 개의 정보를 추가한다.

- 향상된 for문을 사용하여 배열에 추가한 개의 정보를 모두 출력한다.

실행
결과

멍멍이, 치와와
뽀삐, 진돗개
순심이, 삽살개
철이, 마르티스
삐쭈, 푸들
*/

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("멍멍이", "치와와"));
        dogs.add(new Dog("뽀삐", "진돗개"));
        dogs.add(new Dog("순심이", "삽살개"));
        dogs.add(new Dog("철이", "마르티스"));
        dogs.add(new Dog("삐쭈", "푸들"));
        
        for (Dog dog: dogs) {
            dog.showDogInfo();
        }
    }
}
