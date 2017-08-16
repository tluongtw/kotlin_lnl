package com.twsg.lnl.kotlin.c6_lazy_init.g2_kotlin

import com.twsg.lnl.kotlin.c6_lazy_init.common.DatabaseManager
import com.twsg.lnl.kotlin.c6_lazy_init.common.Student

/**
 * @author tonyl
 */

class StudentService {

    private val databaseManager: DatabaseManager by lazy {
        DatabaseManager()
    }

    fun fetchAllStudent(): List<Student> {
        println("Fetching the list of all students")

        val ids = listOf("student001", "student002", "student003", "student004")

        return ids.map { id ->
            databaseManager.loadStudentById(id)
        }
    }
}

fun main(args: Array<String>) {
    val service = StudentService()
    service.fetchAllStudent()
}