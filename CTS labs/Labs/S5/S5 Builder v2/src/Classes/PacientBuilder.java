package Classes;

public class PacientBuilder implements AbstractBuilder{
    private boolean hasRetractableBed;
    private boolean hasRobe;
    private boolean hasBreakfast;
    private boolean hasSlippers;
    private String guestName;

    public PacientBuilder() {
        this.hasRetractableBed = false;
        this.hasRobe = false;
        this.hasBreakfast = false;
        this.hasSlippers = false;
        this.guestName = "";
    }

    @Override
    public Pacient build(String name) {
        return new Pacient(name, hasRetractableBed, hasRobe, hasBreakfast, hasSlippers, guestName);
    }

    public PacientBuilder setHasRetractableBed(boolean hasRetractableBed) {
        this.hasRetractableBed = hasRetractableBed;
        return this;
    }

    public PacientBuilder setHasRobe(boolean hasRobe) {
        this.hasRobe = hasRobe;
        return this;
    }

    public PacientBuilder setHasBreakfast(boolean hasBreakfast) {
        this.hasBreakfast = hasBreakfast;
        return this;
    }

    public PacientBuilder setHasSlippers(boolean hasSlippers) {
        this.hasSlippers = hasSlippers;
        return this;
    }

    public PacientBuilder setGuestName(String guestName) {
        this.guestName = guestName;
        return this;
    }
}
