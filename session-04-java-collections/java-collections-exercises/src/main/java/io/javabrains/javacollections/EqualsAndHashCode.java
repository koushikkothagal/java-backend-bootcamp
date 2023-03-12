


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


class Person{
    public Person(String firstName, String lastName, String lastModifiedDate, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastModifiedDate = lastModifiedDate;
        this.age = age;
    }

    String firstName,lastName,lastModifiedDate;
    int age;

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String lastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return age == person.age;
    }

    @Override
    public int hashCode() {
        return age;
    }
}

public class EqualsAndHashCode {

    public static void main(String[] args) {

        Person p;
        Set<Person> s=new LinkedHashSet<>();
        s.add(new Person("raja","ram","23",50));
        s.add(new Person("ram","ragu","22",35));
        s.add(new Person("raja","ram","23",50));
        s.forEach((i)->{
            System.out.println(i);
        });

    }
}