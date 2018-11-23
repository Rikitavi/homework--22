package ru.mukhametzyanov;

public class PersonSimple implements Comparable<PersonSimple>{
    private String name;

    public PersonSimple(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int compareTo(PersonSimple personSimple){
        return name.compareTo(personSimple.getName());
    }

    @Override
    public String toString() {
        return "PersonSimple{" +
                "name='" + name + '\'' +
                '}';
    }
}
