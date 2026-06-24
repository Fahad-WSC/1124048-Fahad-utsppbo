package controllers;

import models.*;
import java.util.ArrayList;

public class DeviceController {

    public void tambahHandphone(String brand, String model, OperatingType os , int ramSize, int storageSize) {
        Elektronik handphone = new Handphone(brand, model, os , ramSize, storageSize);
        DataStore.addElektronik(handphone);
    }

    public void tambahLaptop(String brand, String model, OperatingType os , int ramSize, int storageSize) {
        Elektronik laptop = new Laptop(brand, model, os , ramSize, storageSize);
        DataStore.addElektronik(laptop);
    }

    public void tambahKomputer(String brand, String model, OperatingType os , int ramSize, int storageSize, String gpu, String cpu) {
        Elektronik komputer = new Komputer(brand, model, os , ramSize, storageSize, gpu, cpu);
        DataStore.addElektronik(komputer);
    }


    public ArrayList<Elektronik> semuaDevice() {
        return DataStore.getListElektronik();
    }
}