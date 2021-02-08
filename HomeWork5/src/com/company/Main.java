package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Vladimir Sergeev", "Teacher", "v.sergeev@mail.ru", "+79257897485", 56023.67f, 37);
        employeesArray[1] = new Employee("Alexey Martirosyan", "Director", "a.martirosyan@mail.ru", "+79164478558", 356054.74f, 42);
        employeesArray[2] = new Employee("Berezhnoy Sergey", "Engineer", "s.berezhnoy@mail.ru", "+79254478458", 47580.00f, 62);
        employeesArray[3] = new Employee("Oksana Ivanchenko", "Accountant", "o.ivamchenko@mail.ru", "+79111236545", 75000.00f, 55);
        employeesArray[4] = new Employee("Natalya Solomina", "Secretary", "n.solomina@mail.ru", "+79682255225", 28054.12f, 24);

        final int maxAge = 40;
        for (Employee employee : employeesArray) {
            if (employee.getAge() > maxAge) {
                System.out.println(employee.toString());
            }
        }
    }
}
