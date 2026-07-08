package com.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ComparatorDemo {
    static void main(String[] args) {
        CompletableFuture<String> future = new CompletableFuture<>();
        /*future*/
        Employee employee = new Employee(1, "name", 1213213123);
        Employee employee1 = new Employee(2, "name1", 213213123);
        Employee employee2 = new Employee(3, "name2", 1312213123);
        Employee employee3 = new Employee(4, "name3", 13213123);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Collections.sort(list, (e1, e2) -> e1.name.compareTo(e2.name));
        Collections.sort(list, (e1, e2) -> Double.compare(e1.salary, e2.salary));
        Collections.sort(list, Comparator.comparing(Employee::getSalary));
        list.sort(Comparator.comparing(Employee::getSalary));
        list.sort(new NameComparator());
    }
}


class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

class NameComparator implements Comparator<Employee> {
    // this method should return 0,1,-1;
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}