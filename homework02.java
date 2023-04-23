import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */


public class homework02 {
    public static void main(String[] args) {
        
        List <Integer> listOfOddNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        System.out.println("Задан список целых чисел: " + listOfOddNumbers);

        for (int i = 0; i < listOfOddNumbers.size(); i++) {
            if (listOfOddNumbers.get(i) % 2 == 0) listOfOddNumbers.remove(i--);
        }

        System.out.println("Список, после удаления всех четных чисел: " + listOfOddNumbers);
    }
}
