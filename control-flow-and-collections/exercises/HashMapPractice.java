import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        HashMap<Integer,String> classRoster = new HashMap<>();
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.isEmpty()) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.isEmpty());

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
