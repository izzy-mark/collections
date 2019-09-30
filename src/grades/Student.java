package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int grade) {
        this.name = name;
        this.grades.add(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0.0;
        for (int grade: grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public static void main(String[] args) {
//        Student test1 = new Student("Mark", 54);
//        Student test2 = new Student("Izzy", 66);
//        Student test3 = new Student("Matt", 87);
//        Student test4 = new Student("Bryan", 24);
//
//        System.out.println(test1.name + " " + test1.grades);
//
//        test1.addGrade(60);
//
//        System.out.println(test1.name + " " + test1.grades);
//
//        System.out.println(test1.getGradeAverage());
    }
}
