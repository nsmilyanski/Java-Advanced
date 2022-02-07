package CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departmentMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            Employee employee = null;
            if (tokens.length == 4){
                employee = new Employee(name, salary, position, department);
            }else if (tokens.length == 6){
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee = new Employee(name, salary, position, department, email, age);
            }else if (tokens.length == 5){
                try{
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(name, salary, position, department, age);

                }catch (NumberFormatException e){
                    String email = tokens[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            }
            departmentMap.putIfAbsent(department, new Department(department));
            departmentMap.get(department).getEmployees().add(employee);
        }

        Department getHighestPaidDepartment = departmentMap.entrySet().stream()
                .max(Comparator.comparing(entry -> entry.getValue().calculateAverageSalary()))
                .get().getValue();

        System.out.printf("Highest Average Salary: %s%n", getHighestPaidDepartment.getDepartment());

        getHighestPaidDepartment.getEmployees().stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);


    }
}
