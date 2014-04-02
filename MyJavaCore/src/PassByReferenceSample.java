/**
 * Created with IntelliJ IDEA.
 * User: Tom Mac
 * Date: 4/1/14
 * Time: 10:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class PassByReferenceSample {

    public static void main(String[] args) {

        // New Person
        Person person = new Person("Tom", "Mac");
        String city = "Boston";
        int age = 40;
        Integer height = new Integer("60");

        doSomething(person, city, age, height);

        System.out.println("FirstName : " + person.getFirstName());
        System.out.println("city: " + city);
        System.out.println("age: " + age);
        System.out.println("height: " + height);

    }


    public static void doSomething(Person person, String city, int age, Integer height){
        person.setFirstName("John");
        city = "Saigon";
        age = 15;
        height = 2;

    }

}
