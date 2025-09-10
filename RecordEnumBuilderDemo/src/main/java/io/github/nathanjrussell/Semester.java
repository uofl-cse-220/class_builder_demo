package io.github.nathanjrussell;

public enum Semester {
    SPRING(1),
    SUMMER(2),
    FALL(3);

    private final int code;

    Semester(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Semester fromCode(int code) {
        return switch (code) {
            case 1 -> SPRING;
            case 2 -> SUMMER;
            case 3 -> FALL;
            default -> throw new IllegalArgumentException("Invalid semester code: " + code);
        };
    }
}
