package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(30);

        Person person2 = new Person();
        person2.setFirstName("John");
        person2.setLastName("Doe");
        person2.setAge(30);

        System.out.println("Are they the same: " + person.equals(person2));
        System.out.println("Are they the same: " + person2.equals(person));
        int x = person.hashCode();
        int y = person2.hashCode();
        System.out.println("Person 1 HashCode : " + x);
        System.out.println("Person 2 HashCode : " + y);
        System.out.println("Are they the same: " + Integer.compare(x,y));

    }
}
