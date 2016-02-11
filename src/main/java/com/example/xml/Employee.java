package com.example.xml;

/**
 *
 * @author Ola Theander <ola.theander@myola.se>
 */
class Employee {

    String id;
    String firstName;
    String lastName;
    String location;

    @Override
    public String toString() {
        return firstName + " " + lastName + "(" + id + ")" + location;
    }
}
