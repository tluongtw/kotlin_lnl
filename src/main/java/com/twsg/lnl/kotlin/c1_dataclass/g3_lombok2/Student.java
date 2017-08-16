package com.twsg.lnl.kotlin.c1_dataclass.g3_lombok2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author tonyl
 */

@Data
@AllArgsConstructor
public class Student {

    private final String id;

    private final String firstName;

    private final String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
