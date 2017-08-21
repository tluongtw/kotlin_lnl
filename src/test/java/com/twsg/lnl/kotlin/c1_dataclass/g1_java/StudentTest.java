package com.twsg.lnl.kotlin.c1_dataclass.g1_java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author tonyl
 */
public class StudentTest {

    @Test
    public void testGetFullName() {
        Student student = new Student("A001", "Daniel", "Lee");

        assertEquals("Daniel Lee", student.getFullName());
    }
}
