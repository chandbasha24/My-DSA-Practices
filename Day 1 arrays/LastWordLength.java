public class LastWordLength {
  
    public static int lastword(String s){
        int Lw=0;
        int length=s.length();  //chandbasha
        for(int i=length-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                Lw++;
            }
            else{
                break;
            }
        }return Lw;

    }
    public static void main(String[] args) {
        String str="chand kjdkjgdg llll";
        
        System.out.println(lastword(str));
    }
}
