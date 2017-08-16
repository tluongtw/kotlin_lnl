package com.twsg.lnl.kotlin.c1_dataclass.g2_lombok1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author tonyl
 */

@ToString
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Student {

    private final String id;

    private final String firstName;

    private final String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
