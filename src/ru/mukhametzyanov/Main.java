package ru.mukhametzyanov;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //PersonSimple sort
        List<PersonSimple> personSimples = new ArrayList<>();
        personSimples.add(new PersonSimple("Mike"));
        personSimples.add(new PersonSimple("Jake"));
        personSimples.add(new PersonSimple("Alex"));

        System.out.println("PersonSimple list: ");
        for (PersonSimple personSimple : personSimples) {
            System.out.println(personSimple.getName());
        }
        System.out.println();

        Collections.sort(personSimples);

        System.out.println("PersonSimple list after sort: ");
        for (PersonSimple personSimple : personSimples) {
            System.out.println(personSimple.getName());
        }
        System.out.println();

        //PersonSuperComparator sort
        List<PersonSuper> personSupers = new ArrayList<>();

        personSupers.add(new PersonSuper("Mike", 43));
        personSupers.add(new PersonSuper("Jake", 23));
        personSupers.add(new PersonSuper("Alex", 63));

        System.out.println("PersonSuper list: ");
        for (PersonSuper personSuper : personSupers) {
            System.out.println(personSuper);
        }
        System.out.println();

        Collections.sort(personSupers, new PersonSuperComparator());
        System.out.println("PersonSuper list after sort: ");
        for (PersonSuper personSuper : personSupers) {
            System.out.println(personSuper);
        }
    }
}
