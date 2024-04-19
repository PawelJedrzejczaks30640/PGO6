import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<StudyProgramme> programmes = new ArrayList<>();
        programmes.add(new StudyProgramme("Informatyka", "Opis", 7, 5)); //0
        programmes.add(new StudyProgramme("Matematyka", "Matematyka", 6, 8)); //1

        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", new Date(1980, 1, 1), programmes.get(0), 3);
        s1.addGrade(5, "PGO");
        s1.addGrade(2, "APBD");
        students.add(s1);

        Student s2 = new Student("Kamil", "Kar", "kamil@wp.pl", "Łódź, Łazarska 1", new Date(1982, 3, 15), programmes.get(1), 9);
        s2.addGrade(5, "TEM");
        s2.addGrade(3, "RPG");
        students.add(s2);

        Student s3 = new Student("Kamila", "Jabłońska", "kamilka@wp.pl", "Sosnowiec, Drzewna 3", new Date(1992, 6, 25), programmes.get(1), 0);
        s3.addGrade(5, "TEM");
        s3.addGrade(3, "RPG");
        students.add(s3);

        Student.promoteAllStudents(students);

        Student.displayInfoAboutAllStudents(students);
    }
}