package views;

import controllers.DeviceController;
import models.*;
import util.InputUtil;
import java.util.ArrayList;

public class KendaraanView {
    private final DeviceController deviceController;

    public KendaraanView(DeviceController deviceController) {
        this.deviceController = controller;
    }

    public void Menu() {
        while (true) {
            System.out.println("1. Tambah Device");
            System.out.println("2. Tampilkan Device");
            
            int pilihan = InputUtil.getInt("Pilih opsi menu: ");

            if (pilihan == 1) {
                tambahDevice();
            } else if (pilihan == 2) {
                tampilkanDevice();
            }else {
                System.out.println("Opsi tidak tersedia. Silakan masukkan angka 1-3.");
            }
    }

    private void tambahDevice() {
        System.out.println("1. HandPhone");
        System.out.println("2. Laptop");
        System.out.println("3. Komputee");
        
        int jenis = InputUtil.getInt("Masukkan pilihan (1-3): ");

        if (jenis == 1) {
            String brand = InputUtil.getString("Masukkan nama brand: ");
            String model = InputUtil.getString("Masukkan model: ");
            int pilihOS = InputUtil.getInt("Pilihan OS (1. Android / 2. Ios): ");
            OperatingType os = OperatingType.ANDROID
            if (pilihOS == 2){
                os = OperatingType.IOS
            }

            int ramSize = InputUtil.getInt("Masukkan Ram Size: ");
            int storageSize = InputUtil.getInt("Masukkan Storage Size: ");
            controller.tambahHandphone(brand, model, os , ramSize, storageSize);

        } else if (jenis == 2) {
            String brand = InputUtil.getString("Masukkan nama brand: ");
            String model = InputUtil.getString("Masukkan model: ");
            int pilihOS = InputUtil.getInt("Pilihan OS (1. Windows / 2. Linux / 3.Mac): ");
            OperatingType os = OperatingType.WINDOWS
            if (pilihOS == 2){
                os = OperatingType.LINUX
            } else if (pilihOS = 3){
                os = OperatingType.MAC
            }

            int ramSize = InputUtil.getInt("Masukkan Ram Size: ");
            int storageSize = InputUtil.getInt("Masukkan Storage Size: ");
            controller.tambahLaptop(brand, model, os , ramSize, storageSize);

        } else if (jenis == 3) {
            String brand = InputUtil.getString("Masukkan nama brand: ");
            String model = InputUtil.getString("Masukkan model: ");
            int pilihOS = InputUtil.getInt("Pilihan OS (1. Windows / 2. Linux / 3.Mac): ");
            OperatingType os = OperatingType.WINDOWS
            if (pilihOS == 2){
                os = OperatingType.LINUX
            } else if (pilihOS = 3){
                os = OperatingType.MAC
            }

            int ramSize = InputUtil.getInt("Masukkan Ram Size: ");
            int storageSize = InputUtil.getInt("Masukkan Storage Size: ");
            int gpu = InputUtil.getString("Masukkan Gpu: ");
            int cpu = InputUtil.getInt("Masukkan Cpu: ");
            controller.tambahKomputer(brand, model, os , ramSize, storageSize, gpu, cpu);

        }else {
            System.out.println("Error");
        }
    }

    private void tampilkanDevice() {
        ArrayList<Elektronik> daftarDevice = controller.semuaDevice();

        if (daftarDevice.isEmpty()) {
            System.out.println("(Daftar Device kosong)");
            return;
        }

        for (Elektronik e : daftarDevice) {
            System.out.println(e.getPrintDetail());
        }
    }
}