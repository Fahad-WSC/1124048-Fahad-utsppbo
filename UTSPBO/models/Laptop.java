package UTSPBO.models;

public class Laptop extends Elektronik implements Powerable, Updatable ,RamReplaceable, StorageReplaceable{
    private String brand;
    private String model;
    private OperatingType type;
    private int ramSize;
    private int storageSize;

    public Laptop(String brand, String model, OperatingType type, int ramSize, int storageSize) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    @Override
    public void powerOn() {
        System.out.println("Laptop: " + brand + " " + type + "nyala");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop: " + brand + " " + type + "mati");
    }

    @Override
    public void update() {
        System.out.println("Laptop: " + brand + " " + type + "Sedang update");
    }

    @Override
    public void replaceRam(int ramSize) {
        this.ramSize = ramSize;
        System.out.println("RAM Laptop " + brand + " " + type + " diganti  jadi: " + ramSize);
    }

    @Override
    public void replaceStorage(int storageSize) {
        this.storageSize = storageSize;
        System.out.println("Storage Laptop " + brand + " " + type + " diganti jadi: " + storageSize);
    }

    @Override
    public String getPrintDetail() {
        return "Laptop" + brand + "Model: " + model + " " + type + "RAM: " + ram + "Storage: " + storage + "CPU: " + cpu + "GPU: " + gpu;
    }
}