package thisDemo;

public class Person {
    String name;
    int age;

    Person() {
        this("이하랑", 17);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person returnIsSelf() {
        return this;
    }
}
