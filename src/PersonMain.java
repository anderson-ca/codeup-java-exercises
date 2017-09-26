import util.Input;

public class PersonMain {
    public static void main(String[] args) {
        Person somePerson = new Person("Anderson");

        System.out.println(somePerson.getName());

        System.out.println(somePerson.sayHello());

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        Input userInput = new Input();

    }
}
