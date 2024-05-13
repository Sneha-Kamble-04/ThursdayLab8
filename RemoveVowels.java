/*
Q5)Write a program in Java to accept a word/a String 
and display the new string after removing all the vowels present in it.
*/
package Removevowels;
import java.util.Scanner;

public class RemoveVowels 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Accept a word or string
        System.out.print("Enter A String: ");
        String String1 = scanner.nextLine();
        System.out.println("String Before Removing Vowels : "+String1);

        // Remove vowels and display the new string
        String result = removeVowels(String1);
        System.out.println("String after removing vowels: " + result);

        scanner.close();
    }

    private static String removeVowels(String String1) 
    {
        // Using regular expression to remove vowels (case-insensitive)
        return String1.replaceAll("[aeiouAEIOU]", "");
    }
}

