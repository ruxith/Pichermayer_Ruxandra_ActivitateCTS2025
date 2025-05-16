package Classes;

public class Medic {
    private String sectie;

    public Medic(String sectie) {
        this.sectie = sectie;
    }

    public Boolean verificaInternare(Pacient pacient){
        if(pacient.getNume().length() >=4)
        {
            System.out.println(pacient.getNume() +  " trebuie internat");
            return true;
        } else {
            System.out.println(pacient.getNume() +  " nu trebuie internat");
            return false;
        }
    }
}
