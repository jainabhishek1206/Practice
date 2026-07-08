package com.shared;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
    // this method should return 0,1,-1;
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}
