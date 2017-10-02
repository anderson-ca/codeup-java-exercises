package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();

    static Input userInput = new Input();

    public static void main(String[] args) {

        Student Anderson = new Student("Anderson", 85);

        Anderson.addGrade(69);

        Anderson.addGrade(100);

        Student Ilaha = new Student("Ilaha", 80);

        Ilaha.addGrade(67);

        Ilaha.addGrade(56);

        Student Rick = new Student("Rick", 100);

        Rick.addGrade(100);

        Rick.addGrade(100);


        students.put("coderGuy666", Anderson);

        students.put("coolChick23", Ilaha);

        students.put("Rickster123", Rick);

        System.out.println("Welcome!\n\nHere are the github usernames of our students:\n");

        System.out.print("|");

        doStuff();

    }

    public static void doStuff() {

        ////////////////////// Loop through all entries inside my hash map. and display the key values. ////////////////////////////////////////
        for (String key : students.keySet()) {

            System.out.print(key + "| ");

        }
        System.out.println("\n");

        //////////////////////////////////////////////////// Ask user for input //////////////////////////////////////////////////////////
        System.out.println("What student would you like to see more information on?");

        String studentKey = userInput.getNextString();

        //////////////////////////////////////////// Check if input exists inside my list of students. //////////////////////////////////
        if (!students.containsKey(studentKey)) {

            System.out.println("Sorry, no student found with github username \"" + studentKey + "\".\n\nWould you like to see another student!\n");

            boolean confirm = userInput.yesNo();

            if (confirm) {

                doStuff();

            } else {

                System.out.println("GoodBye, have a wonderful day!");

            }

        } else if (students.containsKey(studentKey)) {

            System.out.println("Name: " + students.get(studentKey).getName() + " - GitHub Username: " + studentKey);
            System.out.println("Student Average: " + students.get(studentKey).getGradeAverage() + "\n");

            System.out.println("Would you like to see another student?");

            boolean confirm2 = userInput.yesNo();

            if (confirm2) {

                doStuff();

            } else {

                System.out.println("GoodBye, have a wonderful day!");

            }

        }

    }


}
