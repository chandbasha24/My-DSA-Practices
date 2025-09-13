// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MergeTwoSorted  {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr1[]={1,3,5,6,9};
        int arr2[]={23,24,26};
        int output[]=mergeArrays(arr1,arr2);
        for(int i:output){
        System.out.print(i+" ");}
    }
    
    static int[] mergeArrays(int arr1[],int arr2[]){
        int mergearr[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
           if(arr1[i]<arr2[j]){
            mergearr[k++]=arr1[i++];
           }
           else{
                 mergearr[k++]=arr2[j++];
           }
        }
        while(i<arr1.length){
                mergearr[k++]=arr1[i++];
        }
        while(j<arr2.length){
                mergearr[k++]=arr2[j++];
        }
        return mergearr;
    }
}