public class Palindrome {
    public static void main(String[] args) {
        String str="malaylam";
        String normal=str.toLowerCase();
        boolean palindrome=true;
        int left=0;
        int right=normal.length()-1;
        while(left<right){
            if(normal.charAt(left)!=normal.charAt(right)){
                palindrome=false;
                break;
               
               
            }
            left++;
            right--;
        }
        if(palindrome){
            System.out.println("this is palindore");
        }
        else{
            System.out.println("not this is palindore");
        }


    }
}
