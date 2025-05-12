package Classes;

public class Doctor extends Employee{
    private double spor;

    public Doctor(String name, double salary, double spor) {
        super(name, salary);
        this.spor = spor;
    }

    @Override
    public String toString() {
        return super.toString() + "Doctor{" +
                "spor=" + spor +
                '}';
    }
}
