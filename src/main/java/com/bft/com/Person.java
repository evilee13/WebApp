package com.bft.com;

public class Person {
    private String firstName;
    private String lastName;

    public Person(){

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public boolean equals(Object person) {
        Person otherPerson = (Person) person;
        return firstName.equals(otherPerson.firstName) && lastName.equals(otherPerson.lastName);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    public int compareTo(Person p) {
        int result = this.firstName.compareTo(p.firstName);
        if (result == 0) {
            result = this.lastName.compareTo(p.lastName);
        }
        return result;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " ";
    }
}
