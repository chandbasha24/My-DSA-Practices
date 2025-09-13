import java.util.Arrays;

public class StringRearrange {
    public static String rearrangeString(String input) {
        // Step 1: Convert input string to a sorted character array
        char[] chars = input.toCharArray();
        Arrays.sort(chars); // Sort characters alphabetically

        // Step 2: Use a StringBuilder to construct the result
        StringBuilder result = new StringBuilder();

        // Frequency array to track used characters
        int[] freq = new int[26];
        for (char c : chars) {
            freq[c - 'a']++;
        }

        // Step 3: Alternate between forward and reverse traversal
        boolean forward = true; // Start with forward traversal
        while (result.length() <input.length()) {
            if (forward) {
                // Traverse alphabetically
                for (int i = 0; i < 26; i++) {
                    if (freq[i] > 0) {
                        result.append((char) (i + 'a'));
                        freq[i]--;
                    }
                }
            } else {
                // Traverse reverse alphabetically
                for (int i = 25; i >= 0; i--) {
                    if (freq[i] > 0) {
                        result.append((char) (i + 'a'));
                        freq[i]--;
                    }
                }
            }
            forward = !forward; // Switch direction
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test Case 1
        String t1 = "aaaabbbbcccc";
        System.out.println("Output for t1: " + rearrangeString(t1)); // Expected: abccbaabc

        // Test Case 2
        String t2 = "rtarta";
        System.out.println("Output for t2: " + rearrangeString(t2)); // Expected: art
    }
}
