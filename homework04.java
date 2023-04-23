import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * *Реализовать разность массивов и симметрическую разность.
 */

public class homework04 {
    public static void main(String[] args) {
        
        List <Integer> listOfIntegersA = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List <Integer> listOfIntegersB = new ArrayList<>(Arrays.asList(4,5,6,7,8,9));
            
        System.out.println("Разность массивов B и A: " + relComplementAinB(listOfIntegersA, listOfIntegersB));
        System.out.println("Симметрическая разность массивов: " + symmetricDifference(listOfIntegersA, listOfIntegersB));        
    }

    public static List<Integer> relComplementAinB(List<Integer> listA, List<Integer> listB){
        
        List<Integer> result = new ArrayList<>();
        
        for (Integer thisListAItem : listA) {
            if (!listB.contains(thisListAItem)) result.add(thisListAItem);
        }
        
        return result;
    }

    public static List<Integer> symmetricDifference(List<Integer> listA, List<Integer> listB){
        
        List<Integer> AinB = relComplementAinB(listA, listB);
        List<Integer> BinA = relComplementAinB(listB, listA);        

        AinB.addAll(BinA);
        return AinB;
    }
}
