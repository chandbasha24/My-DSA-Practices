import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovePrepositions {
    public static String removePrepositions(String input) {
        // List of common prepositions
        Set<String> prepositions = new HashSet<>(Arrays.asList(
            "about", "above", "across", "after", "against", "along", "among", "around", "at", 
            "before", "behind", "below", "beneath", "beside", "between", "beyond", "by", 
            "down", "during", "except", "for", "from", "in", "inside", "into", "like", 
            "near", "of", "off", "on", "out", "over", "through", "to", "toward", "under", 
            "up", "upon", "with", "within", "without"
        ));

        // Split the input into words
        String[] words = input.split("\\s+");

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // If the word is not a preposition, add it to the result
            if (!prepositions.contains(word)) {
                result.append(word).append(" ");
            }
        }

        // Return the result as a trimmed string
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Example input
        String input = "The cat jumped over the wall and ran across the garden.";

        // Call the method and print the result
        String output = removePrepositions(input);
        System.out.println("Original Sentence: " + input);
        System.out.println("After Removing Prepositions: " + output);
    }
}
