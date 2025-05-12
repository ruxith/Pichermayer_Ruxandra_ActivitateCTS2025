package Classes;

public class Pacient {
    private String name;
    private boolean hasRetractableBed;
    private boolean hasRobe;
    private boolean hasBreakfast;
    private boolean hasSlippers;
    private String guestName;

    protected Pacient(String name, boolean hasRetractableBed, boolean hasRobe, boolean hasBreakfast, boolean hasSlippers, String guestName) {
        this.name = name;
        this.hasRetractableBed = hasRetractableBed;
        this.hasRobe = hasRobe;
        this.hasBreakfast = hasBreakfast;
        this.hasSlippers = hasSlippers;
        this.guestName = guestName;
    }

    protected void setHasRetractableBed(boolean hasRetractableBed) {
        this.hasRetractableBed = hasRetractableBed;
    }

    protected void setHasRobe(boolean hasRobe) {
        this.hasRobe = hasRobe;
    }

    protected void setHasBreakfast(boolean hasBreakfast) {
        this.hasBreakfast = hasBreakfast;
    }

    protected void setHasSlippers(boolean hasSlippers) {
        this.hasSlippers = hasSlippers;
    }

    protected void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "name= " + name +
                ", hasRetractableBed=" + hasRetractableBed +
                ", hasRobe=" + hasRobe +
                ", hasBreakfast=" + hasBreakfast +
                ", hasSlippers=" + hasSlippers +
                ", guestName='" + guestName + '\'' +
                '}';
    }
}
