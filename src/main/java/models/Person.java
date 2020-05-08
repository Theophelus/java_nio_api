package models;

public class Person {
    private final String name;
    private final String lastName;
    protected final int age;
    private final String physicalAddress;

    public Person(String name, String lastName, int age, String physicalAddress) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.physicalAddress = physicalAddress;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", physicalAddress='" + physicalAddress + '\'' +
                '}';
    }
}
