package ru.mukhametzyanov;

public class PersonSuper {
    private String name;
    private int age;

    public PersonSuper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonSuper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
