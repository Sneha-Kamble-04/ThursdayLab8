/*Q6) Write a program in Java to enter a String/Sentence 
and display the longest word and the length of the longest word present in the String.*/
package Longestwordstring;
import java.util.Scanner;

public class LongestWord 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Accept a string or sentence
        System.out.print("Enter a string or sentence: ");
        String String1 = scanner.nextLine();

        // Find and display the longest word and its length
        String[] words = String1.split("\\s+");
        String longestWord = findLongestWord(words);
        int longestWordLength = longestWord.length();

        System.out.println("Longest Word: " + longestWord);
        System.out.println("Length of Longest Word: " + longestWordLength);

        scanner.close();
    }

    private static String findLongestWord(String[] words) 
    {
        String longestWord = "";
        for (String word : words) {
            // Remove punctuation from the word
            word = word.replaceAll("[^a-zA-Z]", "");

            // Compare lengths to find the longest word
            if (word.length() > longestWord.length()) 
            {
                longestWord = word;
            }
        }
        return longestWord;
    }
}

