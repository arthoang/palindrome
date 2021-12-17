package ahoang;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesEvaluatorTest {

   @Test
   void testStringWithLessThanTwoChars() {
      String testString = "A";
      PalindromesEvaluator pe = new PalindromesEvaluator(testString);
      pe.evaluate();
      assertEquals(0, pe.getNumberOfPalindromes());
   }

   @Test
   void testStringWithNoPalindrome() {
      String testString = "ABCDEFGAXYZATB";
      PalindromesEvaluator pe = new PalindromesEvaluator(testString);
      pe.evaluate();
      assertEquals(0, pe.getNumberOfPalindromes());
   }

   @Test
   void testStringWithNestedPalindrome() {
      String testString = "CRARACCAR";
      PalindromesEvaluator pe = new PalindromesEvaluator(testString);
      pe.evaluate();
      assertEquals(3, pe.getNumberOfPalindromes());
   }

   @Test
   void testSortPalindrome() {
      String testString = "CRARACCAR";
      PalindromesEvaluator pe = new PalindromesEvaluator(testString);
      pe.evaluate();
      pe.sortPalindromes();
      ArrayList<Palindrome> al = pe.getListOfSortedPalindromes();
      assertEquals(3, pe.getNumberOfPalindromes());
      assertEquals("RACCAR", al.get(0).getPalindromeString());
      assertEquals("RAR", al.get(1).getPalindromeString());
      assertEquals("ARA", al.get(2).getPalindromeString());
   }

   @Test
   void testPalindromeStringWithLengthIsTwo() {
      String testString = "AA";
      PalindromesEvaluator pe = new PalindromesEvaluator(testString);
      pe.evaluate();
      assertEquals(1, pe.getNumberOfPalindromes());
   }

   @Test
   void testSampleCase() {
      String testString = "ABCBAHELLOHOWRACECARAREYOUILOVEUEVOLIIAMAIDOINGGOOD";
      PalindromesEvaluator pe = new PalindromesEvaluator(testString);
      pe.evaluate();
      pe.sortPalindromes();
      ArrayList<Palindrome> al = pe.getListOfSortedPalindromes();
      assertEquals(11, pe.getNumberOfPalindromes());

      Palindrome p = al.get(0);
      assertEquals("ILOVEUEVOLI", p.getPalindromeString());
      assertEquals(26, p.getStartingIndex());

      p = al.get(1);
      assertEquals("RACECAR", p.getPalindromeString());
      assertEquals(13, p.getStartingIndex());

      p = al.get(2);
      assertEquals("ABCBA", p.getPalindromeString());
      assertEquals(0, p.getStartingIndex());

      p = al.get(3);
      assertEquals("IAMAI", p.getPalindromeString());
      assertEquals(37, p.getStartingIndex());

      p = al.get(4);
      assertEquals("OHO", p.getPalindromeString());
      assertEquals(9, p.getStartingIndex());

      p = al.get(5);
      assertEquals("ARA", p.getPalindromeString());
      assertEquals(18, p.getStartingIndex());

      p = al.get(6);
      assertEquals("RAR", p.getPalindromeString());
      assertEquals(19, p.getStartingIndex());

      p = al.get(7);
      assertEquals("LL", p.getPalindromeString());
      assertEquals(7, p.getStartingIndex());

      p = al.get(8);
      assertEquals("II", p.getPalindromeString());
      assertEquals(36, p.getStartingIndex());

      p = al.get(9);
      assertEquals("GG", p.getPalindromeString());
      assertEquals(46, p.getStartingIndex());

      p = al.get(10);
      assertEquals("OO", p.getPalindromeString());
      assertEquals(48, p.getStartingIndex());

   }




}