
public class kadane_alg{  //maximum sub arrat sum.............
	
	public static int maxSubarraySum(int[] arr) {
		// write your code here
		int n=arr.length;
		int maxi=0;
		// for(int i=0;i<n;i++){
		// 	int sum=0;
		// 	for(int j=i;j<n;j++){
		// 		sum+=arr[j];
		// 		maxi=Math.max(sum,maxi);
		// 	}
		// }
		int currSum=0;
		for(int i=0;i<n;i++){
			currSum=Math.max(arr[i],currSum+arr[i]);
			maxi=Math.max(maxi,currSum);
		}
		
		
		
		return maxi;
	}
	public static void main(String[] args){
		int arr[]={1,2,4,19,-10,3,-4,-20};
		int result=maxSubarraySum(arr);
		// for(int i:result){ //
		// 	System.out.print(i+" ");
		// }
		System.out.println("Maximum subarray sum is "+result);
	}

}

