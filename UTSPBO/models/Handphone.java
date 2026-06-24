package UTSPBO.models;

public class Handphone extends Elektronik implements Powerable, Updatable, Callable {

    private String brand;
    private String model;
    private OperatingType type;
    private int ramSize;
    private int storageSize;

@Override
    public void powerOn() {
        System.out.println("HP: " + brand + " " + type + "nyala");
    }

    @Override
    public void powerOff() {
        System.out.println("HP: " + brand + " " + type + "mati");
    }

    @Override
    public void update() {
        System.out.println("HP: " + brand + " " + type + "Sedang update");
    }

    @Override
    public void makeCall() {
       System.out.println("HP: " + brand + " " + type + "Sedang menelepon");
    }

    @Override
    public String getPrintDetail() {
        return "Handphone" + brand + "Model: " + model + " " + type + "RAM: " + ram + "Storage: " + storage;
    }

}
