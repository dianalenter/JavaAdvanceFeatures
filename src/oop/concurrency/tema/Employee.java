package oop.concurrency.tema;


import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * You arethe manager. You have 5 employees. Simulate the situation in which each of them comes at a different time to work.
 * a)Every employee, after getting to work, displays the information „<name:I came to workat<time HH:MM>.”
 * b)Every 10 seconds, the employee displays „name: I’mstill working!”
 * c)Every 30 seconds,we releaseone of the employees to home (remember about stopping the thread!) andremove the
 * employee from the „active employeeslist”
 * d)When you release your employee to home, print„<name: <time HH:MM>, it's time to go home!”
 * e)* When you release a given employee, allof the othersspeedup. From that moment, display theinformationaboutwork
 * 2 seconds faster.f)**The manager decides in which order releaseemployees (e.g.through an earlier defined list)
 */

public class Employee {
    private String name;
    private volatile boolean ifArrived;

    public Employee(String name) {
        this.name = name;


    }

    public void setIfArrived() {
        this.ifArrived = true;
        System.out.println(this.name + " I come to work at:  " + LocalTime.now());
    }

    public void setIfLeaving() {
        this.ifArrived = false;
        System.out.println(this.name + " I left from work at: " + LocalTime.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIfArrived() {
        return ifArrived;
    }
}


