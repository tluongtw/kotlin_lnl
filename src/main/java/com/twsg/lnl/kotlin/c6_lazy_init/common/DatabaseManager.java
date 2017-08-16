package com.twsg.lnl.kotlin.c6_lazy_init.common;

/**
 * @author tonyl
 */
public class DatabaseManager {

    public DatabaseManager() {
        System.out.println("Initializing DatabaseManager");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Load data from the database.
     */
    public Student loadStudentById(String id) {
        System.out.println("Loading student by ID " + id);
        return new Student(id, "sample student", "sample student");
    }

    public void saveStudent(Student student) {
        System.out.println("Saving data to the database");
    }
}
