package com.twsg.lnl.kotlin.c6_lazy_init.g1_guava;

import com.google.common.base.Suppliers;
import com.twsg.lnl.kotlin.c6_lazy_init.common.DatabaseManager;
import com.twsg.lnl.kotlin.c6_lazy_init.common.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author tonyl
 */
public class StudentService {

    private Supplier<DatabaseManager> databaseManager = Suppliers.memoize(DatabaseManager::new);

    public List<Student> fetchAllStudent() {
        System.out.println("Fetching the list of all students");

        List<String> ids = Arrays.asList("student001", "student002", "student003", "student004");
        List<Student> result = new ArrayList<>();

        for (String id : ids) {
            Student student = databaseManager.get().loadStudentById(id);
            result.add(student);
        }

        return result;
    }


    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.fetchAllStudent();
    }
}
