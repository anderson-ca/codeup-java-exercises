import util.Input;

public class PersonMain {
    public static void main(String[] args) {
//        Person somePerson = new Person("Anderson");
//
//        System.out.println(somePerson.getName());
//
//        System.out.println(somePerson.sayHello());
//
//        //////////////////////////////////////////////////
//        //////////////////////////////////////////////////
//        //////////////////////////////////////////////////
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        //////////////////////////////////////////////////
//        //////////////////////////////////////////////////
//        //////////////////////////////////////////////////
//        Person person3 = new Person("John");
//        Person person4 = person3;
//        System.out.println(person3 == person4);
//
//        //////////////////////////////////////////////////
//        //////////////////////////////////////////////////
//        //////////////////////////////////////////////////
//        Person person5 = new Person("John");
//        Person person6 = person5;
//        System.out.println(person5.getName());
//        System.out.println(person6.getName());
//        person6.setName("Jane");
//        System.out.println(person5.getName());
//        System.out.println(person6.getName());

        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
        Input userInput = new Input();

        ////// get name.
        System.out.println("Enter your name: ");

        String name = userInput.getString();

        System.out.println(name);

        ////// get age.
        System.out.println("Enter age: ");

        int age = userInput.getInt();

        System.out.println(age);

        /////// Get yes or no
        System.out.println("Would you like to continue? y/n");

        boolean userBool = userInput.yesNo();

        System.out.println(userBool);

        /////// Check if number is within specified range.
        userInput.getInt(1, 10);

        /////// Check if Double is within specified range.
        userInput.getDouble(1.0,10.0);

        /////// Get double from user.
        System.out.println("Enter a double: ");

        double userDouble = userInput.getDouble();

        System.out.println(userDouble);
        
    }
}
