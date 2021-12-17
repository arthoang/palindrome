package ahoang;

import java.util.*;
import java.util.stream.Collectors;

public class PalindromesEvaluator {
   // instance variable to keep the input string
   private String evaluatedString;
   // use Set to store found palindromes, to eliminate duplicates
   private Set<Palindrome> palindromes;
   // use List to sort the palindromes by length and starting index
   private List<Palindrome> sortedPalindromes;

   // constructor
   public PalindromesEvaluator(String evaluatedString) {
      this.evaluatedString = evaluatedString;
      palindromes = new HashSet<Palindrome>();
   }

   // public method to invoke the main function.
   public void evaluate() {
      // safety check to make sure the string to be evaluated is not null and has at least 1 character
      if (evaluatedString == null || evaluatedString.length() < 1) {
         return;
      }

      // loop through each character of the string,
      // considering that is the pivot and expands to both side to find palindromes
      for (int i = 0; i < evaluatedString.length(); i++) {
         // find the odd palindrome cases
         findPalindromes(evaluatedString, i, i, palindromes);

         // find the even palindrome cases
         findPalindromes(evaluatedString, i, i+1, palindromes);
      }

   }

   // main function to find the palindromes from a given string
   // the method takes in a string, a left (low) index and right (high) index to begin with
   // it then expands to the left and right of the pivot point to find if the characters on both side are the same
   // it stops when characters are not the same. Ignore cases with only 1 character
   // store palindromes in a set to eliminate duplicates
   private void findPalindromes(String s, int low, int high, Set<Palindrome> p) {
      boolean isPalindrome = false;
      //expand to the left and right of the center until characters on both side are different, hence ends the palindrome
      while (low >=0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
         isPalindrome = true;
         low--;
         high++;
      }
      //only add the longest and exclude length < 2
      if (isPalindrome && (high - low - 1 >=2)) {
         p.add(new Palindrome(s.substring(low+1, high), low+1));
      }
   }


   // sort palindromes by converting Set to List and sort it
   public void sortPalindromes() {
      // create palindrome comparator to sort the palindromes list by length desc, then by starting index asc
      Comparator<Palindrome> palindromeComparator = (o1, o2) ->
         o1.getPalindromeLength() > o2.getPalindromeLength() ? -1 :
            (o1.getPalindromeLength() < o2.getPalindromeLength() ? 1 :
               //if length is equal, compare index asc
               o1.getStartingIndex() > o2.getStartingIndex() ? 1 :
                  o1.getStartingIndex() < o2.getStartingIndex() ? -1 :
                     0
            );
      this.sortedPalindromes = palindromes.stream().sorted(palindromeComparator).collect(Collectors.toList());
   }

   //getter
   public ArrayList<Palindrome> getListOfSortedPalindromes() {
      return new ArrayList<Palindrome>(this.sortedPalindromes);
   }

   public int getNumberOfPalindromes() {
      return palindromes.size();
   }

}
