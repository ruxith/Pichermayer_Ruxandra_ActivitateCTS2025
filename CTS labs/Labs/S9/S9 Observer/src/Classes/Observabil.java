package Classes;

public interface Observabil {
    void adaugaObserver(Observer o);
    void removeObserver(Observer o);
    void trimiteMesaj(String mesaj);

}
