package com.twsg.lnl.kotlin.c5_delegate.map.g1_java;

import java.util.Map;

/**
 * @author tonyl
 */
public class Grade {

    private final Map<String, Double> gradeMap;

    public Grade(Map<String, Double> gradeMap) {
        this.gradeMap = gradeMap;
    }

    public double getMath() {
        return gradeMap.computeIfAbsent("math", key -> Double.NaN);
    }

    public void setMath(double grade) {
        gradeMap.put("math", grade);
    }

    public double getPhysics() {
        return gradeMap.computeIfAbsent("physics", key -> Double.NaN);
    }

    public void setPhysics(double grade) {
        gradeMap.put("physics", grade);
    }
}
