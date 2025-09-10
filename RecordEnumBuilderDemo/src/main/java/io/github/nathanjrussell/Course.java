package io.github.nathanjrussell;

import java.util.Objects;

public record Course(
        int creditHours,
        int courseNum,
        int year,
        int semester, // 1 = Spring, 2 = Summer, 3 = Fall
        String courseName,
        String deptCode,
        String description,
        String instructorFirstName,
        String instructorLastName
) {

    public boolean equals(Course other) {
        return (this.courseNum == other.courseNum) &&
                this.deptCode.equals(other.deptCode);
    }

    public String getFullName() {
        return this.instructorFirstName + " " + this.instructorLastName;
    }
}
