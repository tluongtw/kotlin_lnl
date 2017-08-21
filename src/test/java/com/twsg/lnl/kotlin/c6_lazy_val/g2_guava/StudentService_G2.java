package com.twsg.lnl.kotlin.c6_lazy_val.g2_guava;

import com.google.common.base.Preconditions;
import com.google.common.base.Suppliers;
import com.twsg.lnl.kotlin.c6_lazy_val.common.Student;
import com.twsg.lnl.kotlin.c6_lazy_val.common.StudentRepo;
import com.twsg.lnl.kotlin.c6_lazy_val.common.StudentRepoFactory;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author tonyl
 */
public class StudentService_G2 {

    private StudentRepoFactory repoFactory;

    private Supplier<StudentRepo> repo = Suppliers.memoize(() ->
            repoFactory.createStudentRepo()
    );

    public StudentService_G2(StudentRepoFactory repoFactory) {
        Preconditions.checkNotNull(repoFactory);
        this.repoFactory = repoFactory;
    }

    public void saveStudentList(List<Student> students) {
        students.forEach(student ->
                repo.get().saveStudent(student)
        );
    }

    public Student loadStudent(String id) {
        return repo.get().findStudentById(id);
    }

}
