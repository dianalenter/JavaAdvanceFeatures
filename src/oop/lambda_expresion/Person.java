package oop.lambda_expresion;

public class Person {
    private Integer age;

    public Person(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
    public boolean isAdult() {
        return age > 18;
    }

    public boolean isAdult(Person person) {
        return person.getAge() > 18;
    }
}
