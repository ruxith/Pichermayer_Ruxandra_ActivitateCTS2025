package Classes;

public class SecurityGuard extends Employee{
    private double experience;

    public SecurityGuard(String name, double salary, double experience) {
        super(name, salary);
        this.experience = experience;
    }
}
