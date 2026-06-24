package models;

import java.util.ArrayList;

public class DataStore {
    private static final ArrayList<Elektronik> listElektronik = new ArrayList<>();

    public static void addElektronik(Elektronik e) {
        listElektronik.add(e);
    }

    public static ArrayList<Kendaraan> getListElektronik() {
        return listElektronik;
    }
}