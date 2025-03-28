package Classes;

public class PacientBuilder implements AbstractBuilder{
    private Pacient pacient;

    public PacientBuilder(String name){
        pacient = new Pacient(name, false, false, false, false, "another pacient");
    }

    public PacientBuilder setHasRetractableBed(boolean hasRetractableBed){
        this.pacient.setHasRetractableBed(hasRetractableBed);
        return this;
    }
    public PacientBuilder setHasRobe(boolean hasRobe){
        this.pacient.setHasRobe(hasRobe);
        return this;
    }
    public PacientBuilder setHasBreakfast(boolean hasBreakfast){
        this.pacient.setHasBreakfast(hasBreakfast);
        return this;
    }
    public PacientBuilder setHasSlippers(boolean hasSlippers){
        this.pacient.setHasSlippers(hasSlippers);
        return this;
    }
    public PacientBuilder setGuestName(String hasGuestName){
        this.pacient.setGuestName(hasGuestName);
        return this;
    }

    @Override
    public Pacient getPacient() {
        return this.pacient;
    }
}
