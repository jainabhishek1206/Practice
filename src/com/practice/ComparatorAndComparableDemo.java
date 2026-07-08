package com.practice;

import com.shared.Employee;
import com.shared.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparableDemo {
    static void main(String[] args) {

        Employee employee = new Employee(1,"name", 1213213123);
        Employee employee1 = new Employee(2,"name1", 213213123);
        Employee employee2 = new Employee(3,"name2", 1312213123);
        Employee employee3 = new Employee(4,"name3", 13213123);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        // Collections.sort(CollectionName, Comparator);
        // list.sort(Comparator);
        Collections.sort(list,(e1, e2) -> e1.name.compareTo(e2.name));
        Collections.sort(list,(e1,e2) -> Double.compare(e1.salary, e2.salary));
        Collections.sort(list, Comparator.comparing(Employee::getSalary));
        list.sort(Comparator.comparing(Employee::getName));
        list.sort(Comparator.comparing(Employee::getSalary));
        list.sort(new NameComparator());
        list.sort((e1,e2) -> e1.name.compareTo(e2.name));
    }
}
