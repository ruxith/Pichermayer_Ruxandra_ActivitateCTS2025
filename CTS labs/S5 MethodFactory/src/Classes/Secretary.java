package Classes;

public class Secretary extends Employee {
    private double experience;

    public Secretary(String name, double salary, double experience) {
        super(name, salary);
        this.experience = experience;
    }

}
