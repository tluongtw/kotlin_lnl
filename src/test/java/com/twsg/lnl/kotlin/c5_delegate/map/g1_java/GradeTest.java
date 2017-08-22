package com.twsg.lnl.kotlin.c5_delegate.map.g1_java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.doubleToLongBits;
import static org.junit.Assert.assertEquals;

/**
 * @author tonyl
 */
public class GradeTest {

    @Test
    public void get_grade_should_return_value_from_map() {
        Map<String, Double> gradeMap = new HashMap<String, Double>() {{
            put("math", 5D);
            put("physics", 4.5D);
        }};

        Grade grade = new Grade(gradeMap);

        assertEquals(doubleToLongBits(5D), doubleToLongBits(grade.getMath()));
        assertEquals(doubleToLongBits(4.5D), doubleToLongBits(grade.getPhysics()));
    }

    @Test
    public void set_grade_should_store_value_to_map() {
        Map<String, Double> gradeMap = new HashMap<>();

        Grade grade = new Grade(gradeMap);
        grade.setMath(2.5D);
        grade.setPhysics(4D);

        assertEquals(doubleToLongBits(2.5D), doubleToLongBits(gradeMap.get("math")));
        assertEquals(doubleToLongBits(4D), doubleToLongBits(gradeMap.get("physics")));
    }
}