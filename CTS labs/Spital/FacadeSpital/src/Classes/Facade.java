package Classes;

public class Facade {
    public void verificaInternarePacient(Pacient pacient, Medic medic){
        Salon salon = new Salon(10);

        pacient.verificaGravitatea();

        if(medic.verificaInternare(pacient)){
            System.out.println("Se verifica disponibilitatea paturilor...");

            for(int i = 0; i < 10; i++){
                if(salon.getDisponibilitatePat(i + 1)){
                    System.out.println("Pacientul va fi internat in salonul " + salon.getNrSalon() + " in camera " + (i + 1));
                    salon.getPat(i + 1).setEsteLiber(false);
                    break;
                }
            }
        }
    }
}
