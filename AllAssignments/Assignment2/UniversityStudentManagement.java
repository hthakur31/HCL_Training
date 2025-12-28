import java.util.*;
import java.util.regex.*;

public class UniversityStudentManagement implements StudentOperations {

    Scanner sc = new Scanner(System.in);

    // Collections
    ArrayList<Student> studentList = new ArrayList<>();
    Vector<Student> studentVector = new Vector<>();
    Stack<Student> studentStack = new Stack<>();

    HashMap<Integer, Student> studentMap = new HashMap<>();
    Hashtable<Integer, Student> studentTable = new Hashtable<>();
    TreeMap<Integer, Student> studentTreeMap = new TreeMap<>();

    Set<String> courseSet = new HashSet<>();

    // REGEX patterns
    Pattern idPattern = Pattern.compile("\\d+");
    Pattern namePattern = Pattern.compile("[A-Za-z ]+");
    Pattern coursePattern = Pattern.compile("[A-Za-z ]+");

    @Override
    public void addStudent() {
        try {
            System.out.print("Enter Student ID: ");
            String idStr = sc.next();
            if (!idPattern.matcher(idStr).matches())
                throw new Exception("Invalid ID");

            int id = Integer.parseInt(idStr);

            if (studentMap.containsKey(id))
                throw new Exception("Duplicate Student ID not allowed");

            System.out.print("Enter Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            if (!namePattern.matcher(name).matches())
                throw new Exception("Invalid Name");

            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            if (!coursePattern.matcher(course).matches())
                throw new Exception("Invalid Course");

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            Student s = new Student(id, name, course, marks);

            studentList.add(s);
            studentVector.add(s);
            studentStack.push(s);

            studentMap.put(id, s);
            studentTable.put(id, s);

            courseSet.add(course);

            System.out.println("Student Added Successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void displayStudents() {
        System.out.println("\n--- All Students ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int id = sc.nextInt();

        Student s = studentMap.remove(id);
        if (s != null) {
            studentList.remove(s);
            studentVector.remove(s);
            studentTable.remove(id);
            studentStack.remove(s);
            System.out.println("Student Removed!");
        } else {
            System.out.println("Student Not Found!");
        }
    }

    @Override
    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        Student s = studentMap.get(id);
        if (s != null)
            System.out.println("Found: " + s);
        else
            System.out.println("Student Not Found!");
    }

    // Sort students by marks
    void sortByMarks() {
        studentList.sort(Comparator.comparingInt(st -> st.marks));
        System.out.println("Students Sorted by Marks!");
    }

    // Convert HashMap to TreeMap
    void convertToTreeMap() {
        studentTreeMap = new TreeMap<>(studentMap);
        System.out.println("HashMap converted to TreeMap (Sorted by ID)");
    }

    // Count students course-wise
    void countCourseWise() {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (Student s : studentList) {
            countMap.put(s.course, countMap.getOrDefault(s.course, 0) + 1);
        }

        System.out.println("\n--- Course-wise Student Count ---");
        countMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    // Display unique courses
    void displayCourses() {
        System.out.println("\n--- Unique Courses ---");
        for (String c : courseSet) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        UniversityStudentManagement usm = new UniversityStudentManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== University Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Remove Student by ID");
            System.out.println("5. Sort Students by Marks");
            System.out.println("6. Convert HashMap to TreeMap");
            System.out.println("7. Count Students Course-wise");
            System.out.println("8. Display All Courses");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> usm.addStudent();
                case 2 -> usm.displayStudents();
                case 3 -> usm.searchStudent();
                case 4 -> usm.removeStudent();
                case 5 -> usm.sortByMarks();
                case 6 -> usm.convertToTreeMap();
                case 7 -> usm.countCourseWise();
                case 8 -> usm.displayCourses();
                case 9 -> {
                    System.out.println("Thank You!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
// Interface
interface StudentOperations {
    void addStudent();
    void displayStudents();
    void removeStudent();
    void searchStudent();
}

// Student class
class Student {
    int id;
    String name;
    String course;
    int marks;

    Student(int id, String name, String course, int marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public String toString() {
        return id + " | " + name + " | " + course + " | Marks: " + marks;
    }
}

