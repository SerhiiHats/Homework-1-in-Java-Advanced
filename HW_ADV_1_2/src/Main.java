import models.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**Домашнее задание 1
 Задание 2
 Вывод на экран элементов List:
 Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.
 (УСЛОЖНИЛ ЗАДАЧУ, добавив реализацию сортировки списка (Employee) по зарплате, перед выводом содержимого)
 */

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Дмитрий", "старший специалист", 27, 1500));
        employees.add(new Employee("Ростислав", "специалист", 25, 1100));
        employees.add(new Employee("Наталия", "ведущий деловод", 22, 1300));
        employees.add(new Employee("Сергей", "юрисконсульт", 37, 1700));
        employees.add(new Employee("Антон", "водитель", 40, 900));
        employees.add(new Employee("Ольга", "уборщица", 20, 500));
        employees.add(new Employee("Андрей", "заместитель директора", 31, 1900));
        employees.add(new Employee("Глеб", "исполняющий директор", 27, 2200));
        employees.add(new Employee("Никита", "ведущий специалист", 27, 1500));
        employees.add(new Employee("Данил", "региональный представитель", 29, 1600));

        Collections.sort(employees);

        Iterator<Employee> iterator = employees.listIterator();
        int count = 0;
        System.out.println("Все сотрудники фирмы:");
        System.out.println("___________________________________________________________________________________________");
        while (iterator.hasNext()){
            System.out.println(++count + "." + Employee.bildSpace(3 - String.valueOf(count).length()) + iterator.next());
        }
        System.out.println("___________________________________________________________________________________________");

    }
}
