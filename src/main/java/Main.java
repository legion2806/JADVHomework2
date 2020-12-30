public class Main {

    public static void main(String[] args) throws InterruptedException {

        final Autosalon autosalon = new Autosalon();

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(3000);
            new Thread(null, autosalon::sellCar, "Покупатель " + i).start();
            new Thread(null, autosalon::genereteCar, "Продавец").start();
        }

    }
}
