package com.tom.domainobject;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 11/30/13
 * Time: 8:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Person() {
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
}
