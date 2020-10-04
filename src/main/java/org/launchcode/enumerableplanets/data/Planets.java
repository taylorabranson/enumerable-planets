package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury", 88, 4879),
    VENUS("Venus", 225, 12104),
    EARTH("Earth", 365, 12742),
    MARS("Mars", 687, 6779),
    JUPITER("Jupiter", 4333, 139822),
    SATURN("Saturn", 10759, 116464),
    URANUS("Uranus", 30687, 50724),
    NEPTUNE("Neptune", 60200, 49244);

    private final String name;
    private final int yearLength;
    private final int diameter;

    Planets(String name, int yearLength, int diameter) {
        this.name = name;
        this.yearLength = yearLength;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getDiameter() {
        return diameter;
    }
}
