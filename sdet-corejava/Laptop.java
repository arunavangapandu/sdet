import java.util.Collection;
import java.util.Objects;

public class Laptop extends Computer {
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void start() {
        System.out.println("Laptop started");
    }

    @Override
    public void showInfo() {
        System.out.println("Laptop showInfo() method called");
    }

    public  < E > void genericMethod(E[] inputArray){
        for (E element : inputArray){
            System.out.println("Here is the element: " + element);
        }
    }

    public static <T> void fromArrayToCollection(T[] arr, Collection<T> c) {
        for(T t: arr) {
            System.out.println(c.add(t));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(this.manufacturer, laptop.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}