package org.classroom;

enum SemesterType{
    FALL, SPRING
}

public class Classroom {
    public String student;
    public String teacher;
    public String subject;
    public int grade;
    public SemesterType semester;

    public String setStudent(String student) {
        this.student = student;
        return student;
    }

    public String getStudent() {
        return student;
    }

    public String setTeacher(String teacher) {
        this.teacher = teacher;
        return teacher;
    }

    public String getTeacher() {
        return teacher;
    }

    public String setSubject(String subject) {
        this.subject = subject;
        return subject;
    }

    public String getSubject() {
        return subject;
    }

    public int setGrade(int grade) {
        this.grade = grade;
        return grade;
    }

    public int getGrade() {
        return grade;
    }

    public SemesterType setSemester(SemesterType semester) {
        this.semester = semester;
        return semester;
    }

    public String getSemester() {
        return switch (this.semester) {
            case FALL -> "FALL";
            case SPRING -> "SPRING";
        };
    }
}