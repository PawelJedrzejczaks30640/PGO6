class StudyProgramme {
    String subject;
    String description;
    int itns;
    int semester;

    public StudyProgramme(String subject, String description, int itns, int semester) {
        this.subject = subject;
        this.description = description;
        this.itns = itns;
        this.semester = semester;
    }
}

class Grades {
    int grade;
    String subject;

    public Grades(int grade, String subject) {
        this.grade = grade;
        this.subject = subject;
    }
}