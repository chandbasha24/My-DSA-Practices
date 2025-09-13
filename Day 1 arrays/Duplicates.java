import java.util.*;
public class Duplicates {
    public static int[] removeDuplicates(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int[] result=new int[set.size()];
        int Index=0;
        for(Integer num:set){
            result[Index++]=num;
         
        }return result;

    }

    public static int[] Duplicates(int arr[]){
        Set<Integer> set = new HashSet<>();
        Set<Integer> dupli=new HashSet<>();
        for(int i:arr){
            if(!set.add(i)){
                dupli.add(i);
            }
        }
        int[] Dupli=new int[dupli.size()];
        int Index=0;
        for(Integer num:dupli){
            Dupli[Index++]=num;

        }return Dupli;

    }

    public static void main(String[] args) {
        Duplicates duplicates = new Duplicates();
        int[] array = {1, 2, 3, 4,4, 2, 1, 5, 6, 3};

        // Test removeDuplicates
        int[] uniqueArray = removeDuplicates(array);
        System.out.print("Array without duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test findDuplicates
        int[] duplicateArray = Duplicates(array);
        System.out.print("Duplicate elements: ");
        for (int num : duplicateArray) {
            System.out.print(num + " ");
        }

    }
}
