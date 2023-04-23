
import java.util.Arrays;

/*
 * Реализовать алгоритм сортировки слиянием
 */

public class homework01 {
    public static void main(String[] args) {
        int [] newArr = new int[] {14,12,11,13,10,8,6,9,5,4,2,3,1,0};        
        
        System.out.println("Неотсортированный массив: " + Arrays.toString(newArr));
        System.out.println("Отсортированный массив: " + Arrays.toString(MergeSort(newArr)));
    }

    public static int[] MergeSort(int [] arr) {        
        if (arr.length == 1 || arr.length == 0 ){            
            return arr;         
        }else{            
            int [] leftArray = new int[arr.length/2];
            for (int i = 0; i < arr.length/2; i++) {
                leftArray[i] = arr[i];
            }
            leftArray = MergeSort(leftArray);            
                        
            int [] rightArray = new int[arr.length - arr.length/2];
            for (int i = arr.length/2; i < arr.length; i++) {
                rightArray[i-arr.length/2] = arr[i];
            }
            rightArray = MergeSort(rightArray);            
            
            int counterLeft = 0;
            int counterRigh = 0;
            int counterMerged = 0;

            int [] mergedArray = new int[arr.length];

            while (counterLeft < leftArray.length && counterRigh < rightArray.length){
                if (leftArray[counterLeft] <= rightArray[counterRigh]){
                    mergedArray[counterMerged++] = leftArray[counterLeft++];                  
                } else {
                    mergedArray[counterMerged++] = rightArray[counterRigh++];                    
                }
            }

            while (counterLeft < leftArray.length){
                mergedArray[counterMerged++] = leftArray[counterLeft++];
            }
            
            while (counterRigh < rightArray.length){
                mergedArray[counterMerged++] = rightArray[counterRigh++];
            }                        
            return mergedArray;
        }   
    }
}
