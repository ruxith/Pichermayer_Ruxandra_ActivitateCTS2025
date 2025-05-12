package Classes;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        metodaPlata = new CardBancar(50.87F);
    }

    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public void platesteCalatorie(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }

//    Strategy permite modificarea strategiei !!! (obligatoriu punem setter)
    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }
}
