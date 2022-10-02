package org.classroom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClassroomTest {

    Classroom classroom;

    @BeforeEach
    void setUp(){
        classroom = new Classroom();
    }

    @Test
    void setStudentTest() {
        assertEquals("Kristina Wilson", classroom.setStudent("Kristina Wilson"));
    }

    @Test
    void setTeacherTest() {
        assertEquals("Marc Jordan", classroom.setTeacher("Marc Jordan"));
    }

    @Test
    void setSubjectTest() {
        assertEquals("Math", classroom.setSubject("Math"));
    }

    @Test
    void setGradeTest() {
        assertEquals(95, classroom.setGrade(95));
    }

    @Test
    void setSemesterTest() {
        assertEquals(SemesterType.FALL, classroom.setSemester(SemesterType.FALL));
    }
}
