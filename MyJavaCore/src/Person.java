/**
 * Created with IntelliJ IDEA.
 * User: Tom Mac
 * Date: 4/1/14
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {

    private String firstName;
    private String lastName;

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
}
