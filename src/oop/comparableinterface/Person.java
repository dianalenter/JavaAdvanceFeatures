package oop.comparableinterface;

public class Person implements Comparable<Person> {
    private int centiMeters;


    public Person(int centiMeters) {
        this.centiMeters = centiMeters;

    }

    @Override
    public int compareTo(Person person2) {
        return person2.centiMeters - this.centiMeters;
    }

    @Override
    public String toString() {
        return "Person{" +
                "centiMeters=" + centiMeters +
                '}';
    }
}
