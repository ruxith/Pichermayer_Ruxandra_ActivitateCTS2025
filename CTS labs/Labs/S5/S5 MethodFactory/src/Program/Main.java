package Program;


import Classes.Secretary;
import Factory.EmployeeType;
import Factory.MedicalEmployeeFactory;
import Factory.NonMedicalEmployeeFactory;

public class Main {
    public static void main(String[] args) {
        MedicalEmployeeFactory medicalEmployeeFactory = new MedicalEmployeeFactory(10.5);
        NonMedicalEmployeeFactory nonMedicalEmployeeFactory = new NonMedicalEmployeeFactory(25);

        Secretary secretary = (Secretary) nonMedicalEmployeeFactory.createEmployee(EmployeeType.SECRETARY,"Alina", 3300);
        System.out.println(secretary.toString());
    }
}