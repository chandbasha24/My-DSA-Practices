class Rotate String
 {
    public boolean rotateString(String s, String goal) {
        String whole=s+s;
        if(s.length()!=goal.length())
        {
            return false;
        }
        if(whole.indexOf(goal)==-1)
        { return false;

        }
        else
        {
            return true;
        }
    }
}


Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:

Input: s = "abcde", goal = "abced"
Output: false

