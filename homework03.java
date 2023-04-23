import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
 */

public class homework03 {
    public static void main(String[] args) {        
        List <Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        System.out.println("Задан список целых чисел: " + listOfIntegers);
        System.out.println("Максимальное значение: " + listMaxValue(listOfIntegers));
        System.out.println("Минимальное значение: " + listMinValue(listOfIntegers));
        System.out.println("Среднее арифметическое: " + listAverageValue(listOfIntegers) );

    }

    public static int listMaxValue(List<Integer> list){
        int max = list.get(0);
        for (Integer thisItem : list) {
            if (thisItem > max) max = thisItem;
        }
        return max;
    }

    public static int listMinValue(List<Integer> list){
        int min = list.get(0);
        for (Integer thisItem : list) {
            if (thisItem < min) min = thisItem;
        }
        return min;
    }

    public static double listAverageValue(List<Integer> list){
        double sum = 0;
        for (Integer thisItem : list) {
            sum += thisItem;
        }
        return sum / list.size();
    }
}
