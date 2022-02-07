package CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String department;
    private List<Employee> employees;

    public Department(String department){
        this.department = department;
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }
    public double calculateAverageSalary(){
        return getEmployees().stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public String getDepartment() {
        return this.department;
    }
}
