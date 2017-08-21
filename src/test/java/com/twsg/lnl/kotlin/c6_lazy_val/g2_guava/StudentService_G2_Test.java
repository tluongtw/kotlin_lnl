package com.twsg.lnl.kotlin.c6_lazy_val.g2_guava;

import com.twsg.lnl.kotlin.c6_lazy_val.common.Student;
import com.twsg.lnl.kotlin.c6_lazy_val.common.StudentRepo;
import com.twsg.lnl.kotlin.c6_lazy_val.common.StudentRepoFactory;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * @author tonyl
 */
public class StudentService_G2_Test {

    private final List<Student> students = Arrays.asList(
            new Student("1", "Peter", "Tan"),
            new Student("2", "Jerry", "Ng"),
            new Student("3", "Mary", "Chan"),
            new Student("4", "Sarah", "Brightman")
    );

    @Test
    public void studentRepo_should_be_created_once() throws Exception {
        StudentRepo studentRepo = spy(new StudentRepo());
        StudentRepoFactory repoFactory = spy(new StudentRepoFactory());
        when(repoFactory.createStudentRepo()).thenReturn(studentRepo);

        StudentService_G2 service = new StudentService_G2(repoFactory);
        verify(repoFactory, never()).createStudentRepo();

        service.saveStudentList(students);

        verify(studentRepo, times(students.size())).saveStudent(any());
        verify(repoFactory, times(1)).createStudentRepo();
    }

}