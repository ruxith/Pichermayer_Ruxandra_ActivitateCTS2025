package Factory;

import Classes.Employee;

public interface EmployeeFactory {
    Employee createEmployee(EmployeeType employeeType, String name, double salary);
}
