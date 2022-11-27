package com.test.java.pass.by;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      List<Employee> employeeList =  Arrays.asList(new Employee("Jane", "dove", 23),
                new Employee("John", "dove", 44),
                new Employee("Marry", "Smith", 40)
                );

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1)); // done in constant time O(1)

        System.out.println(employeeList.isEmpty());

        employeeList.set(2, new Employee("aruna", "vangapandu", 36));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.size());

        employeeList.add(1, new Employee("shreyan", "vangapandu",
                 38));

        employeeList.forEach(employee -> System.out.println(employee));

    }
}

