package oop.concurrency.tema;


import java.time.LocalTime;
import java.util.List;

public class MyThread extends Thread {
    private List<Employee> employeeList;

    public MyThread(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void run() {
        for (int i = 0; i < employeeList.size(); i++) {

            try {
                Thread.sleep(5000);
                System.out.println(employeeList.get(i).getName() + " :I'm still working: " + LocalTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

