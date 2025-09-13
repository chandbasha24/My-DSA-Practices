import java.util.Arrays;

public class Binary{
    public static void main(String[] args) {
        int arr[]={1,4,56,3,25,};
        int target=56;
         Arrays.sort(arr);
        int index=Binary(arr,target);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(" found" +index);
        }
    }
    public static int Binary(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
               }        
            if(arr[mid]<target){
                low=mid+1;
            }           
            else{
                high=mid-1;
            }
              
        }
        return -1;
    }
}


// def binary_search(arr, target):
//     low, high = 0, len(arr) - 1
//     while low <= high:
//         mid = (low + high) // 2
//         if arr[mid] == target:
//             return mid
//         elif arr[mid] < target:
//             low = mid + 1
//         else:
//             high = mid - 1
//     return -1

// arr = [1, 4, 56, 3, 25]
// target = 56
// arr.sort()
// index = binary_search(arr, target)

// if index == -1:
//     print("Not found")
// else:
//     print("Found at index", index)
