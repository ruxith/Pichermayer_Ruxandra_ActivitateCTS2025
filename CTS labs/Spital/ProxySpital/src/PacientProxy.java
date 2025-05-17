public class PacientProxy implements IPacient{

    Pacient pacient;

    public PacientProxy(Pacient pacient) {
        this.pacient = pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    @Override
    public void descriere() {
        System.out.println(pacient.getNume() +  " " + (pacient.isAreAsigurare()?" are asigurare":"nu are asigurare"));

    }

    @Override
    public void internare() {
        if(pacient.isAreAsigurare()){
            System.out.println("Pacientul a fost internat.");
        } else {
            System.out.println("Pacientul nu poate fi internat deoarece nu este asigurat.");
        }
    }
}
