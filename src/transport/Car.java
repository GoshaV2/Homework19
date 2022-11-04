package transport;

public abstract class Car extends Transport {
    private float volumeEngine;
    public Car(String brand, String model) {
        super(brand, model);
    }

    public float getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(float volumeEngine) {
        this.volumeEngine = valueOrDefault(volumeEngine);
    }

    public abstract void startMove();

    public abstract void endMove();
    public abstract void hasDiagnostic() throws Exception;

    public abstract void runDiagnostic();

    @Override
    public String toString() {
        return "Car{" +
                "volumeEngine='" + getBrand() + '\'' +
                "volumeEngine=" + getModel() + '\'' +
                "volumeEngine=" + volumeEngine + '\'' +
                '}';
    }
}