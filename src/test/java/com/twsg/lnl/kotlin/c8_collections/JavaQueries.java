package com.twsg.lnl.kotlin.c8_collections;

import com.twsg.lnl.kotlin.c8_collections.common.Case;
import com.twsg.lnl.kotlin.c8_collections.common.Status;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author tonyl
 */
public class JavaQueries {

    public static Optional<Case> findCaseById(List<Case> cases, String id) {
        return cases.stream()
                .filter(c ->
                        c.getId().equals(id))
                .findFirst();
    }

    public static List<Case> findOpenCasesByReporter(List<Case> cases, String reporter) {
        return cases.stream()
                .filter(c -> c.getReporter().equals(reporter))
                .filter(c -> c.getStatus() == Status.OPEN)
                .collect(Collectors.toList());
    }

    public static Map<Status, List<Case>> groupCaseByStatus(List<Case> cases) {
        return cases.stream().collect(
                Collectors.groupingBy(
                        Case::getStatus,
                        Collectors.toList()
                )
        );
    }

    public static Map<String, Integer> countCaseByReporter(List<Case> cases) {
        return cases.stream().collect(
                Collectors.groupingBy(
                        Case::getReporter,
                        // Collectors.counting() returns a Long, but we need Integer.
                        Collectors.reducing(0, e -> 1, Integer::sum)
                )
        );
    }

    private JavaQueries() {
    }

}
