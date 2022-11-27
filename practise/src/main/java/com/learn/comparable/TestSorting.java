package com.learn.comparable;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TestSorting {

    private static List<Developer> getDevelopers() {
        return Arrays.asList(new Developer("shreyan", 12, new BigDecimal(100)),
                new Developer("shresta", 12, new BigDecimal(1000)),
                new Developer("aruna", 12, new BigDecimal(2000)),
                new Developer("vijay", 12, new BigDecimal(10000)));

    }

    public static void main(String[] args) {
        List<Developer> devsList =  getDevelopers();
        System.out.println(Arrays.asList("hello", "how", "are","you?"));
        System.out.println(devsList);
        devsList.sort((d1,d2) -> d1.getAge() - d2.getAge());
        devsList.sort((d1,d2) -> d1.getName().compareTo(d2.getName()));
        devsList.sort((d1,d2) -> d1.getSalary().compareTo(d2.getSalary()));

    }

    static class Developer {
      private String name;
      private int age;
      private BigDecimal salary;

        public Developer(String name, int age, BigDecimal salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }
}
