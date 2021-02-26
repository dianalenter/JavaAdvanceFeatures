package oop.enums;

public enum Planets {
    JUPITER("nuge", 1000),
    PLUTO("small", 600),
    VENUS("medium", 3000);

    private String size;
    private String name;
    private int distance;

    Planets(String size, int distance) {
        this.size = size;
        this.distance = distance;
    }

    public String getSize() {
        return size;
    }


    public String getName() {
        return name;
    }

    public void distanceFromEarth() {
        System.out.println(name() + " " + distance);
    }

    @Override
    public String toString() {
        return size + " " + name;
    }
}
