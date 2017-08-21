package com.twsg.lnl.kotlin.c6_lazy_val.g1_vanilla;

import com.google.common.base.Preconditions;
import com.twsg.lnl.kotlin.c6_lazy_val.common.Student;
import com.twsg.lnl.kotlin.c6_lazy_val.common.StudentRepo;
import com.twsg.lnl.kotlin.c6_lazy_val.common.StudentRepoFactory;

import java.util.List;

/**
 * @author tonyl
 */
public class StudentService_G1 {

    private Lazy<StudentRepo> studentRepo;

    public StudentService_G1(StudentRepoFactory repoFactory) {
        Preconditions.checkNotNull(repoFactory);
        this.studentRepo = new Lazy<>(repoFactory::createStudentRepo);
    }

    public void saveStudentList(List<Student> students) {
        students.forEach(student ->
                studentRepo.get().saveStudent(student)
        );
    }

    public Student loadStudent(String id) {
        return studentRepo.get().findStudentById(id);
    }

}
