import java.util.ArrayList;
import java.util.List;

public class Autosalon {

    CarSeller seller = new CarSeller(this);
    List<Car> car = new ArrayList<>(0);

    public Car sellCar() {
        return seller.sellCar();
    }

    public void genereteCar() {
        seller.genereteCar();
    }

    public Autosalon() throws InterruptedException {
    }

    List<Car> getCars() {
        return car;
    }

}
