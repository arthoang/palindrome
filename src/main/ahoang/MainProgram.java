package ahoang;

import java.util.ArrayList;

public class MainProgram {
   public static void main(String[] args) {
      if (args.length == 0) {
         System.out.println("Need to pass in a string to evaluate");
      } else {
         String evaluateString = args[0];
         PalindromesEvaluator pe = new PalindromesEvaluator(evaluateString);
         //evaluate the input string and find palindromes
         pe.evaluate();
         //sort the palindromes
         pe.sortPalindromes();
         //get the sorted list
         ArrayList<Palindrome> palindromes = pe.getListOfSortedPalindromes();
         //print the palindromes
         for (Palindrome p: palindromes) {
            System.out.println(p);
         }
      }
   }
}
