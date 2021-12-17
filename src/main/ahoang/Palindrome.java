package ahoang;

public class Palindrome {
   private String palindromeString;
   private int startingIndex;

   public Palindrome(String palindromeString, int startingIndex) {
      this.palindromeString = palindromeString;
      this.startingIndex = startingIndex;
   }

   public int getStartingIndex() {
      return startingIndex;
   }

   public int getPalindromeLength() {
      return this.palindromeString.length();
   }

   public String getPalindromeString() {
      return this.palindromeString;
   }

   @Override
   public String toString() {
      return this.palindromeString + ", " + startingIndex + ", " + getPalindromeLength();
   }

}
