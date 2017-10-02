package grades;

import java.util.ArrayList;

public class Student {

    ///////////////////////////////// Properties. ////////////////////////////////////////
    private String name;

    private ArrayList<Integer> grades;

    /////////////////////////////////// Constructor. ////////////////////////////////////
    public Student(String name, int grades) {

        this.name = name;

        this.grades = new ArrayList<>();

        this.grades.add(grades);

    }

    ///////////////////////////////// Methods. //////////////////////////////////////////
    public String getName() {

        return this.name;

    }

    /// Return Grade
    public void addGrade(int grade) {

        this.grades.add(grade);

    }

    /// Calculate Average
    public double getGradeAverage() {

        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {

             sum += grades.get(i);

        }

        return sum / grades.size();
    }

}
