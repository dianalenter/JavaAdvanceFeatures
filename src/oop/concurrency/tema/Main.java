package oop.concurrency.tema;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EmployeeThread> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Marius");
        Employee employee2 = new Employee("Adela");
        Employee employee3 = new Employee("Ion");
        Employee employee4 = new Employee("Alexandru");
        Employee employee5 = new Employee("Ciprian");

        EmployeeThread employeeThread1 = new EmployeeThread(employee1);
        employeeList.add(employeeThread1);
        EmployeeThread employeeThread2 = new EmployeeThread(employee2);
        employeeList.add(employeeThread2);
        EmployeeThread employeeThread3 = new EmployeeThread(employee3);
        employeeList.add(employeeThread3);
        EmployeeThread employeeThread4 = new EmployeeThread(employee4);
        employeeList.add(employeeThread4);
        EmployeeThread employeeThread5 = new EmployeeThread(employee5);
        employeeList.add(employeeThread5);


        for (EmployeeThread element : employeeList) {
            element.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int index = 0;
        while (employeeList.size()>0){
            employeeList.get(0).stopWork();
            employeeList.remove(0);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}