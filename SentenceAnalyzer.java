/*Q4)WAP to enter any sentence and calculate the following:
a) Total number of digits present in it.
b) Total number of small letters and capital letters present in it.
c) Total number of alphabets used in it.
d) Total number of special character used in it.
e) Total number of vowels presents in it.
f) Total Number words present in that sentence.
*/
package SenteneceCalc;
import java.util.Scanner;

public class SentenceAnalyzer 
{
  public static void main(String[] args) 
  {
      Scanner scanner = new Scanner(System.in);

      // Accept a sentence
      System.out.print("Enter a sentence: ");
      String sentence = scanner.nextLine();

      // Calculate and display the requested information
      calculateAndDisplay(sentence);

      scanner.close();
  }

  private static void calculateAndDisplay(String sentence) 
  {
      // a) Total number of digits
      int totalDigits = countDigits(sentence);
      System.out.println("a) Total number of digits: " + totalDigits);

      // b) Total number of small letters and capital letters
      int totalSmallLetters = countSmallLetters(sentence);
      int totalCapitalLetters = countCapitalLetters(sentence);
      System.out.println("b) Total number of small letters: " + totalSmallLetters);
      System.out.println("c) Total number of capital letters: " + totalCapitalLetters);

      // c) Total number of alphabets
      int totalAlphabets = countAlphabets(sentence);
      System.out.println("d) Total number of alphabets: " + totalAlphabets);

      // d) Total number of special characters
      int totalSpecialCharacters = countSpecialCharacters(sentence);
      System.out.println("e) Total number of special characters: " + totalSpecialCharacters);

      // e) Total number of vowels
      int totalVowels = countVowels(sentence);
      System.out.println("f) Total number of vowels: " + totalVowels);

      // f) Total number of words
      int totalWords = countWords(sentence);
      System.out.println("g) Total number of words: " + totalWords);
  }

  private static int countDigits(String sentence)
  {
      return sentence.replaceAll("[^0-9]", "").length();
  }

  private static int countSmallLetters(String sentence) 
  {
      return sentence.replaceAll("[^a-z]", "").length();
  }

  private static int countCapitalLetters(String sentence) 
  {
      return sentence.replaceAll("[^A-Z]", "").length();
  }

  private static int countAlphabets(String sentence) 
  {
      return sentence.replaceAll("[^a-zA-Z]", "").length();
  }

  private static int countSpecialCharacters(String sentence) 
  {
      return sentence.replaceAll("[a-zA-Z0-9\\s]", "").length();
  }

  private static int countVowels(String sentence)
  {
      return sentence.replaceAll("[^aeiouAEIOU]", "").length();
  }

  private static int countWords(String sentence) 
  {
      String[] words = sentence.split("\\s+");
      return words.length;
  }
}
