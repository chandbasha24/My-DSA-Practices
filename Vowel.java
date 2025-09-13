public class Vowel {
    public static void main(String[] args) {
        String str="Hello World";
        for(char c:str.toLowerCase().toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
               continue;
            }
            else{
                System.out.print(c+"");
            }

        }
         System.out.println();

         String str0="hello chand";
         String re="";
         for(int i=str0.length()-1;i>=0;i--){
             re=re+str0.charAt(i);
         }
         re=re.trim();
         System.out.println(re);
         
        String str1="hello chand";
        
        String[] words=str1.split(" ");
         String rev="";
        for(int i=words.length-1;i>=0;i--){
           rev=rev+words[i]+" ";
        }
        rev=rev.trim();
        System.out.println(rev);
         
  
        String str2="hello world";
        String rev1="";
        String[] wordss=str2.split(" ");
        for(String word:wordss){
            String reverseword="";
            for(int i=word.length()-1;i>=0;i--){
            reverseword+=word.charAt(i);
            }
            rev1=rev1+reverseword+" ";
        }
        rev1=rev1.trim();
         System.out.println(rev1);
        
    }
}
