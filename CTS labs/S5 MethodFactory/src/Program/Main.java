package Program;


import Factory.MedicalEmployeeFactory;
import Factory.NonMedicalEmployeeFactory;

public class Main {
    public static void main(String[] args) {
        MedicalEmployeeFactory medicalEmployeeFactory = new MedicalEmployeeFactory(10.5);
        NonMedicalEmployeeFactory nonMedicalEmployeeFactory = new NonMedicalEmployeeFactory(25);


    }
}