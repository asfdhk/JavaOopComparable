import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = { 5, 2, 9, 1, 7 };
        Integer maxInt = Demo.max(intArray);
        System.out.println("Максимальное значение: " + maxInt);

        String[] stringArray = { "apple", "banana", "orange" };
        String maxString = Demo.max(stringArray);
        System.out.println("Максимальная строка: " + maxString);
    }



}
