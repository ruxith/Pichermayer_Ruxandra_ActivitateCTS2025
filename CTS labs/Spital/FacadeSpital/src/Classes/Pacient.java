package Classes;

public class Pacient {
    private String nume;
    private int nivelGravitate;

    public Pacient(String nume, int nivelGravitate) {
        this.nume = nume;
        this.nivelGravitate = nivelGravitate;
    }

    public int getNivelGravitate() {
        return nivelGravitate;
    }

    public String getNume() {
        return nume;
    }

    public void verificaGravitatea(){
        if(nivelGravitate <= 5){
            System.out.println("Nivel mediu de gravitate");
        } else {
            System.out.println("E cam nasol. E nivel mare.");
        }
    }
}
