package designe_patterns.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;


    private String status;
    private List<Observer> followers; //= new ArrayList<>();

    public Subject(String name) {
        this.name = name;
        this.followers = new ArrayList<>();
    }

    public void addFollower(Observer observer) {
        followers.add(observer);
    }

    public void postUpdate(String mesage) {
        status = mesage;
        System.out.println("sunt " + name + " si postez " + mesage);
        for (Observer follower : followers) {
            follower.notifyOfSubjectUpdate();
        }
    }

    public String getName() {

        return name;
    }

    public String getStatus() {

        return status;
    }

    public void removeFollower(Observer observer) {
        followers.remove(observer);
    }
}
