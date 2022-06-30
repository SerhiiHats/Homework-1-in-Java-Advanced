import models.Car;
import java.util.*;

/**Домашнее задание 1
   Задание 3
 В папке с примерами, ex_004_comparable.
 Дописать логику, чтобы метод compareTo() осуществил поиск
 по скорости(если же скорость у 2-х объектов равна, то ищем по цене) -> цене - > моделе -> цвету машины.
 */

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(190, 28000, "BMW", "Red"));
        cars.add(new Car(150, 12000, "Opel", "Black"));
        cars.add(new Car(180, 45000, "Mercedes", "White"));
        cars.add(new Car(190, 26500, "Acura", "White"));
        cars.add(new Car(190, 26500, "Acura", "Black"));
        cars.add(new Car(180, 45000, "Mercedes", "Grey"));
        cars.add(new Car(145, 12000, "Opel", "Green"));
        cars.add(new Car(190, 27000, "BMW", "Blue"));
        Collections.sort(cars);
        ListIterator<Car> iterator = cars.listIterator();
        System.out.println("________________________________________________________________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("________________________________________________________________________");


    }
}
