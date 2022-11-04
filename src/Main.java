import exception.WrongLoginException;
import exception.WrongPasswordException;
import model.Validator;
import transport.Bus;
import transport.Car;
import transport.PassengerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1(){
        try {
            System.out.println(Validator.checkForm("GoodfunV2","123456_","123456_"));
        }catch (WrongLoginException e){
            System.out.println("Введите корректный логин");
            e.printStackTrace();
        }catch (WrongPasswordException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void task2(){
        Bus bus=new Bus("Bus","b2");
        PassengerCar passengerCar=new PassengerCar("PassengerCar","d2");
        passengerCar.runDiagnostic();
        Truck truck=new Truck("Truck","t2");

        for(Car car: new Car[]{bus,passengerCar,truck}){
            try {
                car.hasDiagnostic();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}