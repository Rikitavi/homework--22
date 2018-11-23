package ru.mukhametzyanov;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<PersonSuper> {

    public int compare(PersonSuper person1, PersonSuper person2) {
        return person1.getName().compareTo(person2.getName());
//        return Integer.compare(person1.getAge(), person2.getAge());
    }
}
