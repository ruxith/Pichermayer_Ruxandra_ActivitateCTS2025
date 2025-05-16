package Classes;

public class Nurse extends Employee{
    private double spor;

    public Nurse(String name, double salary, double spor) {
        super(name, salary);
        this.spor = spor;
    }

    @Override
    public String toString() {
        return super.toString() + "Nurse{" +
                "spor=" + spor +
                '}';
    }
}
