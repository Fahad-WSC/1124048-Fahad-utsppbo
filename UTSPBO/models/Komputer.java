package UTSPBO.models;

public class Komputer extends Elektronik implements Powerable, Updatable , Callable, RamReplaceable, StorageReplaceable, CPUReplaceable, GPUReplaceable {
    private String brand;
    private String model;
    private OperatingType type;
    private int ramSize;
    private int storageSize;
    private String cpu;
    private String gpu;

    public Komputer(String brand, String model, OperatingType type, int ramSize, int storageSize, String cpu, String gpu) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    @Override
    public void powerOn() {
        System.out.println("Komputer: " + brand + " " + type + "nyala");
    }

    @Override
    public void powerOff() {
        System.out.println("Komputer: " + brand + " " + type + "mati");
    }

    @Override
    public void update() {
        System.out.println("Komputer: " + brand + " " + type + "Sedang update");
    }

    @Override
    public void replaceRam(int ramSize) {
        this.ramSize = ramSize;
        System.out.println("RAM Komputer " + brand + " " + type + " diganti  jadi: " + ramSize);
    }

    @Override
    public void replaceStorage(int storageSize) {
        this.storageSize = storageSize;
        System.out.println("Storage Komputer " + brand + " " + type + " diganti jadi: " + storageSize);
    }

    @Override
    public void replaceCPU(String cpu) {
        this.cpu = cpu;
        System.out.println("CPU Komputer " + brand + " " + type + " diganti jadi: " + cpu);
    }

    @Override
    public void replaceGPU(String gpu) {
        this.gpu = gpu;
        System.out.println("GPU Komputer " + brand + " " + type + " diganti jadi: " + gpu);
    }

    @Override
    public String getPrintDetail() {
        return "Komputer" + brand + "Model: " + model + " " + type + "RAM: " + ram + "Storage: " + storage + "CPU: " + cpu + "GPU: " + gpu;
    }
}