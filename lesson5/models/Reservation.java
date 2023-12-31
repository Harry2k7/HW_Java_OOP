package models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;

    private final int id;

    public int getId() {
        return id;
    }

    private Date date;

    private String name;
    public Date getDate() {
        return date;
    }
    public String getName() {
        return name;
    }
    {
        id = ++counter;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }


}
