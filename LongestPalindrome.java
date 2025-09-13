public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        // Iterate through each character of the string
        for (int i = 0; i < s.length(); i++) {
            // Expand around center for odd-length palindromes
            int len1 = expandAroundCenter(s, i, i);

            // Expand around center for even-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);

            // Get the maximum length of the palindrome from both expansions
            int len = Math.max(len1, len2);

            // Update the start and end indices if a longer palindrome is found
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Return the longest palindromic substring
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        // Expand as long as the characters on both sides are equal
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Return the length of the palindrome
        return right - left - 1;
    }
}
