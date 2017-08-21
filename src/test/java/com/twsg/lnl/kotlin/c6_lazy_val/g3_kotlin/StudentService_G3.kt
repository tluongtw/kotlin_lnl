package com.twsg.lnl.kotlin.c6_lazy_val.g3_kotlin

import com.twsg.lnl.kotlin.c6_lazy_val.common.Student
import com.twsg.lnl.kotlin.c6_lazy_val.common.StudentRepo

/**
 * @author tonyl
 */

class StudentService_G3(repoFactory: () -> StudentRepo) {

    private val repo by lazy {
        repoFactory()
    }

    fun saveStudentList(students: List<Student>) {
        students.forEach { student ->
            repo.saveStudent(student)
        }
    }

    fun loadStudent(id: String): Student {
        return repo.findStudentById(id)
    }
}
