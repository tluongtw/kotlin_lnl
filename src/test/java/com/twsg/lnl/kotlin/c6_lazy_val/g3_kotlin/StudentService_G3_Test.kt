package com.twsg.lnl.kotlin.c6_lazy_val.g3_kotlin

import com.twsg.lnl.kotlin.c6_lazy_val.common.Student
import com.twsg.lnl.kotlin.c6_lazy_val.common.StudentRepo
import com.twsg.lnl.kotlin.c6_lazy_val.common.StudentRepoFactory
import org.junit.Test
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.*

/**
 * @author tonyl
 */
class StudentService_G3_Test {

    private val students = listOf(
            Student("1", "Peter", "Tan"),
            Student("2", "Jerry", "Ng"),
            Student("3", "Mary", "Chan"),
            Student("4", "Sarah", "Brightman")
    )

    @Test
    fun `studentRepo should be created once`() {
        val studentRepo = spy(StudentRepo())
        val repoFactory = spy(StudentRepoFactory())
        `when`(repoFactory.createStudentRepo()).thenReturn(studentRepo)

        val service = StudentService_G3(repoFactory::createStudentRepo)
        verify(repoFactory, never()).createStudentRepo()

        service.saveStudentList(students)

        verify(studentRepo, times(students.size)).saveStudent(any())
        verify(repoFactory, times(1)).createStudentRepo()
    }

}