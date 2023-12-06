# Data-Structures-and-Algorithms
This repository is focused on data structures and algorithms. Includes implementations, explanations, and examples for fundamental concepts like arrays, linked lists, trees, sorting algorithms, and more. Ideal for learners and enthusiasts aiming to understand and apply DSA principles using Java.

`public class arrayLists {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(); // The default capacity is 10 if not specified
        employeeList.add(new Employee("Jana", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        System.out.println(employeeList.get(1)); // Done in constant time

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Addams", 4568));
        // employeeList.forEach(employee -> System.out.println(employee));
        
        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("Mary", "Smith", 22)));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}`