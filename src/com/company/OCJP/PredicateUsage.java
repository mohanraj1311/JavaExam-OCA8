//Predicate class has to implement the test() function which shall
//        return a boolean always.
//        This test function can return as a expression or a statement.
//        if expression then e -> e.salary is enough
// if statement, then it should be a proper return statement: (Employee e) -> { return e.


package com.company.OCJP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Employee{
    String name;
    int age;
    double salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString(){
        return name;
    }


}

public class PredicateUsage {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("James", 25, 15000));
        list.add(new Employee("John", 23, 5000));
        list.add(new Employee("Liya", 25, 10000));
        list.add(new Employee("Diya", 24, 12000));

        process(list, e->e.getSalary()>=10000);
        System.out.println(list);
    }

    private static void process(List<Employee> list, Predicate<Employee> predicate){
        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()){
            if(predicate.test(iterator.next()))
                iterator.remove();
        }
    }


}
