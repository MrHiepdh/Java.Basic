package junior;
public class Student {
    private String ID = "";
    private String name = "";
    private double averageScore = 0;
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAverageScore() {
        return averageScore;
    }
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
    public Student() {
    }
    public Student(String ID, String name, double averageScore) {
        this.ID = ID;
        this.name = name;
        this.averageScore = averageScore;
    }
    public Student(String ID, String name) {
        this(ID, name, 0);
    }
    public String rank() {
        String type = "";
        if (averageScore < 5)
            type = "Fail!";
        else if (averageScore < 7.5)
            type = "Medium!";
        else if (averageScore < 9)
            type = "Great!";
        else if (averageScore <= 10)
            type = "Perfect!";
        return type;
    }
    public void display() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Rank: " + rank());
        System.out.println("--------------------------\n");
    }
}
class ManagementStudent {
    private Student[] arrStudent = new Student[50];
    private int len = 0;
    public void add(Student student) {
        arrStudent[len++] = new Student(student.getID(), student.getName(), student.getAverageScore());
    }
    public void remove(String ID) {
        boolean wasFound = false;
        for (int i = 0; i < len; i++) {
            if (arrStudent[i].getID() == ID) {
                for (int j = i + 1; j < len; j++) {
                    arrStudent[j - 1] = arrStudent[j];
                }
                arrStudent[len--] = null;
                wasFound = true;
                break;
            }
        }
        if (!wasFound) {
            System.out.println(ID + " is not in list!");
        }
    }
    public Student[] getStudents() {
        return this.arrStudent;
    }
    public void showAllStudents() {
        for (int i = 0; i < len; i++) {
           arrStudent[i].display();
        }
    }
    public void sortByAvgScore() {
        Student temp = new Student();
        for (int i = 0 ; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arrStudent[i].getAverageScore() > arrStudent[j].getAverageScore()) {
                    temp = arrStudent[i];
                    arrStudent[i] = arrStudent[j];
                    arrStudent[j] = temp;
                }
            }
        }
    }
    public void searchByName(String name) {
        boolean wasFound = false;
        for (int i = 0; i < len; i++) {
            if (arrStudent[i].getName() == name) {
                arrStudent[i].display();
                wasFound = true;
            }
        }
        if (!wasFound) {
            System.out.println(name + " not found!");
        }
    }
    public void searchByAvgScore(double a, double b) {
        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }
        boolean wasFound = false;
        for (int i = 0; i < len; i++) {
            if (arrStudent[i].getAverageScore() >= a && arrStudent[i].getAverageScore() <= b) {
                arrStudent[i].display();
                wasFound = true;
            }
        }
        if (!wasFound) {
            System.out.println("No one was found!");
        }
    }
}
class JavaMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("AXZ-001", "Zrone 02", 9.0);
        ManagementStudent mStudent = new ManagementStudent();
        student1.setID("AXZ-000");
        student1.setName("Unknown");
        student1.setAverageScore(9.5);
        student1.display();
        student2.display();
        System.out.println("Rank of Student 2: " + student2.rank() + "\n");
        mStudent.add(student1);
        mStudent.add(student2);
        mStudent.add(new Student("AXZ-002", "Zrone 03"));
        mStudent.add(new Student("AXZ-003", "Zrone 04", 9.7));
        mStudent.add(new Student("AXZ-004", "Zrone 03", 5.6));
        mStudent.showAllStudents();
        mStudent.remove("AXZ-003");
        System.out.println("List after removing AXZ-003");
        mStudent.showAllStudents();
        System.out.println("Try remove a Student who is not in list");
        mStudent.remove("AXZ-003");
        mStudent.sortByAvgScore();
        System.out.println("List after sorting");
        mStudent.showAllStudents();
        System.out.println("Search Student by AvgScore");
        mStudent.searchByAvgScore(7.0, 9.9);
        System.err.println("Search Student by Name");
        mStudent.searchByName("Zrone 03");
    }
}