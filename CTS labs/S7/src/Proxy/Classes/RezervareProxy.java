package Proxy.Classes;

public class RezervareProxy implements IRezervare{

    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String numePersoana, int nrPersoane) {
        if(nrPersoane >= 4){
            rezervare.realizeazaRezervare(numePersoana, nrPersoane);
        } else {
            System.out.println("Imi pare rau, numar de persoane insuficient.");
        }
    }
}
