import java.util.ArrayList;
public class FirstAndLastOccurences 
{
          public static int firstOccurrence(ArrayList<Integer> arr, int n, int k) {
     int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
          }
          public static int lastOccurrence(ArrayList<Integer> arr, int n, int k)
{ 
    int low = 0, high = n - 1;
        int last = -1;
            while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) == k) {
                last = mid;
                // look for smaller index on the left
                low = mid + 1;
            } else if (arr.get(mid) < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }return last;
       
          } 


    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first = firstOccurrence(arr, n, k);
        if (first == -1)
            return new int[]{-1, -1};
        int last = lastOccurrence(arr, n, k);
        return new int[]{first, last};

    }

}

