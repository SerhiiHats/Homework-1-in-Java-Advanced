package models;
/**Домашнее задание 1
 Задание 3
 В папке с примерами, ex_004_comparable.
 Дописать логику, чтобы метод compareTo() осуществил поиск
 по скорости(если же скорость у 2-х объектов равна, то ищем по цене) -> цене - > моделе -> цвету машины.
 */

public class Car implements Comparable<Car> {
    private int speed;
    private int price;
    private String model;
    private String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }
@Override
    public String toString() {
    String space1 = bildSpace(6 - String.valueOf(speed).length());
    String space2 = bildSpace(8 - String.valueOf(price).length());
    String space3 = bildSpace( 11 - model.length());
    String space4 = bildSpace( 7 - color.length());
        return "скорость | " + this.speed + space1 + "| цена | " + this.price + space2 + "| модель | " +
    this.model + space3 + "| цвет | " + this.color + space4 + "|";
    }

    public static String bildSpace(int leghtString) {
        StringBuilder strBld = new StringBuilder();
        for (int i = 0; i < leghtString; i++) {
            strBld.append(" ");
        }
        return strBld.toString();
    }

    @Override
    public int compareTo(Car o) {
        int temp = this.speed - o.speed;
        if (temp == 0) {
            int temp1 = this.price - o.price;
            if (temp1 == 0) {
                int temp2 = this.model.compareTo(o.model);
                if (temp2 == 0) {
                    return this.color.compareTo(o.color);
                } else {
                    return temp2;
                }
            } else {
                return temp1;
            }
        }
        return temp;
    }
}