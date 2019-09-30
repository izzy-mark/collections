package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

        private static HashMap<String, Student> studentMap = new HashMap<>();

    public static void main(String[] args) {

        Student student1 = new Student("Mark", 54);
        Student student2 = new Student("Izzy", 66);
        Student student3 = new Student("Matt", 87);
        Student student4 = new Student("Bryan", 24);
        student1.addGrade(90);
        student2.addGrade(45);
        student3.addGrade(100);
        student4.addGrade(12);
        student1.addGrade(89);
        student2.addGrade(78);
        student3.addGrade(54);
        student4.addGrade(2);

        studentMap.put("strangemark", student1);
        studentMap.put("izzyBrash", student2);
        studentMap.put("gitMatt", student3);
        studentMap.put("gitBryan", student4);
        System.out.println(studentMap);

        displayMenu();

    }

    public static void displayMenu() {

        Input input = new Input();
        System.out.println("Welcome!\n");

        System.out.println();

        System.out.println(
                "What would you like to do? \n" +
                "1) view individual student information \n" +
                "2) view information for all students.");

        int userChoice = input.getInt(1,2);

        if (userChoice == 1){
            individualStudent();
        }else {
            allStudents();
        }


        System.out.println("would you like to see another student");
        if(input.yesNo()){
            displayMenu();
        }else{
            System.out.println("have a wonderful day");
        }

    }

    public static void individualStudent(){
        Input input = new Input();
        boolean keepAsk = true;
        String userSearch;

        System.out.println(" Here are the GitHub usernames of our students:\n");
        for (String key : studentMap.keySet()){
            System.out.print("  |" + key + "| ");
        }
        System.out.println("\n");

        do{
            userSearch = input.getString(" What student would you like to see more information on?");

            if(studentMap.get(userSearch) == null){
                System.out.println("Sorry no student found for " + userSearch);
            } else{
                System.out.println("GitHub Username: " + userSearch);
                System.out.println("Name: " + studentMap.get(userSearch).getName());
                System.out.println("Current Average: " +studentMap.get(userSearch).getGradeAverage());
                System.out.println("Grades: " +studentMap.get(userSearch).getGrades());
                keepAsk = false;
            }
        }while(keepAsk);
    }


//    Allow the user to view all of the grades for all of the students.
//
//    Modify your CLI to provide an option to view the overall class average.
//
//    Modify your CLI to provide an option to print a csv report of all the students.

    public static void allStudents(){
        Input input = new Input();
        System.out.println(
                "What would you like to do? \n" +
                        "1) View all Student's grades \n"+
                        "2) View class average\n " +
                        "3) View csv report for all students"
        );

        int userChoice = input.getInt(1,3);

        if(userChoice == 1){
            for (Student student : studentMap.values()) {
                System.out.println("Student Name: " + student.getName());
                System.out.println("Student Grades: " + student.getGrades());
            }
        }else if(userChoice == 2){
            double total = 0.0;
            for (Student student : studentMap.values()){
                total += student.getGradeAverage();
            }
            System.out.println(total/studentMap.size());
        }else if(userChoice == 3){

            ArrayList<String> gitUser = new ArrayList<>();

            for (String key : studentMap.keySet()){
                gitUser.add(key);
            }
//            System.out.println(gitUser);
//            System.out.println(gitUser.get(0));



            System.out.println("Name, GitHub Username, Average");


           int counter = 0;

                for (Student student : studentMap.values()) {
                    System.out.print( student.getName() + ", ");
                    System.out.print(gitUser.get(counter) + ", ");
                    System.out.print(student.getGradeAverage() + "\n");
                    counter++;
                }



        }




    }

}
