import java.util.ArrayList;
import java.util.Date;

class Student {
    String fname;
    String lname;
    String address;
    String email;
    String studentIndex;
    Date getIntoCollegeYear;
    int currentSemester;
    StudyProgramme programme;
    String studentStatus;
    int studentsITN;

    ArrayList<Grades> grades = new ArrayList<>();

    static int studentQuantity;

    public Student(String fname, String lname, String email, String address, Date getIntoCollegeYear, StudyProgramme programme, int studentsITN) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.getIntoCollegeYear = getIntoCollegeYear;
        this.programme = programme;
        this.studentsITN = studentsITN;
        this.currentSemester = 1;
        studentIndexCalculator();
    }

    public void addGrade(int grade, String subject) {
        grades.add(new Grades(grade, subject));
    }
    public static void promoteAllStudents(ArrayList<Student> students) {
        for (Student student : students) {
            if (student.currentSemester < student.programme.semester && student.studentsITN <= student.programme.itns) {
                student.currentSemester++;
                student.studentStatus = "student";
            } else if (student.currentSemester == student.programme.semester) {
                student.studentStatus = "Graduate";
            } else {
                student.studentStatus = "Failed semester";
            }
        }
    }

    private void studentIndexCalculator() {
        this.studentIndex = String.format("s%05d", 1+studentQuantity++);
    }

    public static void displayInfoAboutAllStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Po promocji:");
            System.out.println("Name: " + student.fname + " " + student.lname);
            System.out.println("Index: " + student.studentIndex);
            System.out.println("Status: " + student.studentStatus);
            System.out.println("Current Semester: " + student.currentSemester);
            System.out.println("ITNs: " + student.studentsITN);
            System.out.println("Grades: ");
            for (Grades grade : student.grades) {
                System.out.println("  " + grade.subject + ": " + grade.grade);
            }
            System.out.println();
        }
    }
}