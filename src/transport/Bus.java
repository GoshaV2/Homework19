package transport;

import java.lang.invoke.WrongMethodTypeException;

public class Bus extends Car implements Competitor {
    public enum TypeCapacity{
        ExtraSmall("до 10 мест"),Small("до 25 мест"),Medium("40-50 мест"),Large("60-80 мест"),EspeciallyLarge("100-120 мест");

        private String description;

        TypeCapacity(String description) {
            this.description = description;
        }

        public String getNameType() {
            return description;
        }
    }


    private float maxSpeed;
    private float bestLapTime;

    private TypeCapacity typeCapacity;

    public Bus(String brand, String model) {
        super(brand, model);
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed < 0 ? 0 : maxSpeed;
    }

    public float getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(float bestLapTime) {
        this.bestLapTime = bestLapTime < 0 ? 0 : bestLapTime;
    }

    public TypeCapacity getTypeCapacity() {
        return typeCapacity;
    }

    public void setTypeCapacity(TypeCapacity typeCapacity) {
        this.typeCapacity = typeCapacity;
    }

    @Override
    public void pitStop() {
        System.out.println("Высаживаем всех и на боковую");
    }

    @Override
    public void startMove() {
        System.out.println("Закрыть двери и погнали");
    }

    @Override
    public void endMove() {
        System.out.println("Остановится и открыть двери");
    }

    @Override
    public void hasDiagnostic() throws Exception {
        throw new Exception("Автобус "+getBrand()+" "+getModel()+" в диагностике не требуется");
    }

    @Override
    public void runDiagnostic() {
        throw new WrongMethodTypeException("Автобусы не могут проходить диагностику");
    }
}
