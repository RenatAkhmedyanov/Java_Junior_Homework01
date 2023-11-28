import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Исходный список: ");
        List<Integer> list = generateArray(10);
        System.out.println(list + "\n");

        System.out.println("Список четных чисел: ");
        List<Integer> evenNumbersList = list.stream().filter(e -> e % 2 == 0).toList();
        System.out.println(evenNumbersList + "\n");

        System.out.println("Среднее значение четных чисел: ");
        double result = evenNumbersList.stream().mapToDouble(e -> e).average().getAsDouble();
        System.out.println(result);
    }


    /**
     * Метод создания массива произвольного размера, элементами которого являются случайные числа от 0 до 9
     * @param size
     * @return
     */
    private static List<Integer> generateArray (int size) {
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(10));
        }
        return list;
    }
}
