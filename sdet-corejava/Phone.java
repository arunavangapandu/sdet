public class Phone extends Computer {
    @Override
    public void start() {
        System.out.println("Phone started");
    }

    @Override
    public void showInfo() {
        System.out.println("Phone showInfo() method called");
    }
}