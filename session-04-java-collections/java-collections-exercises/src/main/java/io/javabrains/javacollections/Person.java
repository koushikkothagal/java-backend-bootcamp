package io.javabrains.javacollections;

import java.util.Date;
import java.util.Objects;

public class Person {

    String firstName;
    String lastName;
    int age ;
    Date lastDateModified;

    // you are using this objects to compare between itsself and another object that you pass in
    // you have to check if the two objects you are comparing are actually not copies
    // then check if the given object is not null or if they are not even instances to the same class both giving false
    // then last you check if each of the chosen fields is the same in the compared objects
    @Override
    public boolean equals(Object o){ // you can only receive Object type into the method
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Person person = (Person) o; // so you have to typecast it into a Person Type
        return this.age == person.age
                && Objects.equals(this.firstName, person.firstName)
                && Objects.equals(this.lastName, person.lastName);
    }

    // next is HashCode generation
    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, age);
    }

/*----------------------------------------------------------------------------------------------------------------  */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age =age;

    }

    public void setLastDateModified(Date lastDateModified) {
        this.lastDateModified = lastDateModified;
    }

    public String getfirstName(){
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public String getLastDateModified(){
        return lastDateModified.toString();
    }

}
