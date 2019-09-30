package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();

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



    }
}
