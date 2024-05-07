package io.javabrains.javacollections;

import java.util.*;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/
class Person implements Comparable<Person>{

    private String firstname;
    private String lastname;
    private int age;
    private Date LastModifiedDate;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastModifiedDate() {
        return LastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        LastModifiedDate = lastModifiedDate;
    }

    Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.LastModifiedDate = new Date();
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return  true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && Objects.equals(firstname,person.firstname) && Objects.equals(lastname,person.lastname);
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstname,lastname,age);
    }

    @Override
    public  int compareTo(Person obj){
        return Integer.compare(this.age,obj.age);
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1 , Person p2){
        return p1.getFirstname().compareTo(p2.getFirstname());
    }
}

class PersonComparator1 implements Comparator<Person> {
    @Override
    public int compare(Person p1 , Person p2){
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
public class EqualsAndHashCode {

    public static void main(String[] args) {

        Person p1 = new Person("Rob","Johnson",35);
        Person p2 = new Person("Rob","Johnson",35);
        Person p3 = new Person("Jon","Willam",33);
        Person p4 = new Person("Jon","Willam",38);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println(p2.equals(p3));

        System.out.println("=========================");
        System.out.println(p1.hashCode()==p2.hashCode());
        System.out.println(p3.hashCode()==p2.hashCode());

        System.out.println("=========================");
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        System.out.println(p1.compareTo(p4));

        System.out.println("=========================");
        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        System.out.println("=========================");

        for (Person p : people){
            System.out.println(p.getFirstname()+ " " +p.getAge());
        }

        System.out.println("=========================");

        PersonComparator nameComparator = new PersonComparator();
        PersonComparator1 ageComparator = new PersonComparator1();

//        Collections.sort(people,nameComparator);
        Collections.sort(people,ageComparator);

        for (Person p : people){
            System.out.println(p.getFirstname()+ " " +p.getAge());
        }
//        System.out.println(people);
    }
}
