package Reservations.Classes;

public abstract class Reservation {
    private String name;
    private int noPers;
    private String date;
    private String time;

    public abstract void description();

    public abstract Reservation copy();

    public Reservation() {
        this.name = "Unknown";
        this.noPers = 4;
        this.date = "01.01.1999";
        this.time = "00:00";
    }

    public Reservation(String name, int noPers, String date, String time) {
        if(name.length() > 3){
            this.name = name;
        }else {
            this.name = "Unknown";
        }
        if(noPers >= 2){
            this.noPers = noPers;
        }else {
            this.noPers = 30;
        }
        if(date.length() == 8){
            this.date = date;
        } else {
            this.date = "01.01.1999";
        }

        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getNoPers() {
        return noPers;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoPers(int noPers) {
        this.noPers = noPers;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
