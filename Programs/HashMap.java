
public class HashMap {

    public static void main(String[] args) {

        java.util.HashMap<String, Integer> students = new java.util.HashMap<>();

        students.put("Prem", 101);
        students.put("Asha", 102);
        students.put("Priya", 103);

        System.out.println("Student Details: " + students);

        System.out.println("Prem Roll Number: " + students.get("Prem"));

        students.put("Prem", 105);

        System.out.println("Updated Details: " + students);
    }
}