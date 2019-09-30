package grades;

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

        displayMenu();

    }

    public static void displayMenu() {
        Input input = new Input();

        System.out.println("        Welcome!\n" +
                "\n" +
                "                Here are the GitHub usernames of our students:\n");

        for (String key : studentMap.keySet()){
            System.out.print("|" + key + "| ");
        }
        System.out.println("\n");

//        System.out.println("What student would you like to see more information on?");

        boolean keepAsk = true;
        String userSearch;

        do{
            userSearch = input.getString("What student would you like to see more information on?");

            if(studentMap.get(userSearch) == null){
                System.out.println("Sorry no student found for " + userSearch);
            } else{
                System.out.println("GitHub Username = " + userSearch);
                System.out.println("Name: " + studentMap.get(userSearch).getName());
                System.out.println("Current Average: " +studentMap.get(userSearch).getGradeAverage());
                keepAsk = false;
            }


        }while(keepAsk);

    }

}
