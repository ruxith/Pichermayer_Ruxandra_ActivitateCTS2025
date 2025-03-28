package Factory;

import Classes.*;

public class NonMedicalEmployeeFactory implements EmployeeFactory{

    private int experience;

    public NonMedicalEmployeeFactory(int experience) {
        this.experience = experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public Employee createEmployee(EmployeeType employeeType, String name, double salary) {
        return switch(employeeType){
            case SECRETARY -> new Secretary(name, salary, experience);
            case SECURITYGUARD -> new SecurityGuard(name, salary, experience);
            default -> null;
        };
    }
}