package Factory;

import Classes.Doctor;
import Classes.Employee;
import Classes.Nurse;

public class MedicalEmployeeFactory implements EmployeeFactory{

    private double spor;

    public MedicalEmployeeFactory(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public Employee createEmployee(EmployeeType employeeType, String name, double salary) {
        return switch(employeeType){
            case NURSE -> new Nurse(name, salary, spor);
            case DOCTOR -> new Doctor(name, salary, spor);
            default -> null;
        };
    }
}
