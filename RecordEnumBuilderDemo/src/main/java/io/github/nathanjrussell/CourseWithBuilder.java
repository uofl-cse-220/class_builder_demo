package io.github.nathanjrussell;

public record CourseWithBuilder(
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
    public static class Builder {
        private int creditHours;
        private int courseNum;
        private int year;
        private int semester; // 1 = Spring, 2 = Summer, 3 = Fall
        private String courseName;
        private String deptCode;
        private String description;
        private String instructorFirstName;
        private String instructorLastName;

        public Builder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder courseNum(int courseNum) {
            this.courseNum = courseNum;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder semester(int semester) {
            this.semester = semester;
            return this;
        }

        public Builder courseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Builder deptCode(String deptCode) {
            this.deptCode = deptCode;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder instructorFirstName(String instructorFirstName) {
            this.instructorFirstName = instructorFirstName;
            return this;
        }

        public Builder instructorLastName(String instructorLastName) {
            this.instructorLastName = instructorLastName;
            return this;
        }

        public CourseWithBuilder build() {
            return new CourseWithBuilder(
                    creditHours,
                    courseNum,
                    year,
                    semester,
                    courseName,
                    deptCode,
                    description,
                    instructorFirstName,
                    instructorLastName
            );
        }
    }

    public boolean equals(CourseWithBuilder other) {
        return (this.courseNum == other.courseNum) &&
                this.deptCode.equals(other.deptCode);
    }

    public String getFullName() {
        return this.instructorFirstName + " " + this.instructorLastName;
    }
}
