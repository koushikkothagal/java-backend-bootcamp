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
        Person p1 = new Person("Nimesh", "Dere", 29, new Date());
        Person p2 = new Person("Nimesh", "Dere", 29, new Date());

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}

class Person extends Object {

    private String firstName;
    private String lastName;
    private int age;
    private Date lastModifiedDate;

    public Person(String firstName, String lastName, int age, Date lastModifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o){
        //check if reference is same
        if (this == o)
            return true;

        //check if object is not null and belongs to same class
        //to check null check and avoid class cast exception
        if (null == o || this.getClass() != o.getClass() )
            return false;

        //Convert object first then
        Person other = (Person) o;
        return this.age == other.age
            && this.firstName == other.firstName
            && this.lastName == other.lastName;
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
