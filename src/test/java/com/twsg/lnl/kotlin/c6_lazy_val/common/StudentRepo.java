package com.twsg.lnl.kotlin.c6_lazy_val.common;

import java.util.HashMap;

/**
 * @author tonyl
 */
public class StudentRepo {

    private final HashMap<String, Student> databaseMock = new HashMap<>();

    public StudentRepo() {
        try {
            System.out.println("Initializing StudentRepo, taking some time...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Load data from the database.
     */
    public Student findStudentById(String id) {
        System.out.println("Loading student by ID " + id);
        return databaseMock.get(id);
    }

    public void saveStudent(Student student) {
        System.out.println("Saving data to the database: " + student);
        databaseMock.put(student.getId(), student);
    }
}
