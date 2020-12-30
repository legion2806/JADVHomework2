public class CarSeller {

    private Autosalon autosalon;

    public CarSeller(Autosalon autosalon) throws InterruptedException {
        this.autosalon = autosalon;
    }

    public synchronized void genereteCar() {
        try {
            Thread.sleep(3000);
            autosalon.getCars().add(new Car());
            System.out.println("Производитель Toyota выпустил 1 авто");
            notify();
        } catch
            (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized Car sellCar() {
        try {
            System.out.println(Thread.currentThread().getName() + " зашел в автосалон");
            Thread.sleep(3000);
            while (autosalon.getCars().size() == 0) {
                System.out.println("Машин нету");
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " уехал на новеньком авто");
        return autosalon.getCars().remove(0);}
}
