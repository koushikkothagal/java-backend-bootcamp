package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import java.util.Date;
import java.util.Objects;

public class EqualsAndHashCode {

    public static void main(String[] args) {
        String firstName = "John", lastName = "Doe";
        int age = 24;
        Person person1 = new Person(firstName, lastName, age);
        Person person2 = new Person(firstName, lastName, age);
        Person person3 = new Person(firstName, lastName, 25);
        System.out.println("Result of person1.equals(person2): " + person1.equals(person2));
        System.out.println("Result of person1.hashCode() == person2.hashCode() : " + (person1.hashCode() == person2.hashCode()));

        System.out.println("\nResult of person1.equals(person3): " + person1.equals(person3));
        System.out.println("Result of person1.hashCode() == person3.hashCode() : " + (person1.hashCode() == person3.hashCode()));
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Date lastModifiedDate;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = new Date();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
