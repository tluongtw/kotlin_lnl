package com.twsg.lnl.kotlin.c1_dataclass.g1_vanilla;

/**
 * @author tonyl
 */
public class Example {

    public static void main(String[] args) {
        Student student = new Student("A001", "Daniel", "Lee");
        System.out.println(student.getFullName());
    }
}
