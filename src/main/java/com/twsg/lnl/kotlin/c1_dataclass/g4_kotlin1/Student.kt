package com.twsg.lnl.kotlin.c1_dataclass.g4_kotlin1

/**
 * @author tonyl
 */
class Student(id: String, firstName: String, lastName: String) {

    val id: String = id

    val firstName: String = firstName

    val lastName: String = lastName

    val fullName: String
        get() = firstName + " " + lastName

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Student

        if (id != other.id) return false
        if (firstName != other.firstName) return false
        if (lastName != other.lastName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }

    override fun toString(): String {
        return "Student(id='$id', firstName='$firstName', lastName='$lastName')"
    }

}