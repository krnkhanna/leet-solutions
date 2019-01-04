package org.spituk.study.leet.solutions;

/**
 * Solution for Leet Code Question "Regular Expression Matching".
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/24/2018
 */
public class RegularExpressionMatching {

  public static void main(String[] args) {
    RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
    //System.out.println(regularExpressionMatching.isMatch("aa", "a"));//System.out.println(regularExpressionMatching.isMatch("aa", "*"));
    //System.out.println(regularExpressionMatching.isMatch("aa", "a*"));
    //System.out.println(regularExpressionMatching.isMatch("aa", "a."));
    //System.out.println(regularExpressionMatching.isMatch("ab", ".*"));
    System.out.println(regularExpressionMatching.isMatch("aab", "c*a*b"));
    //System.out.println(regularExpressionMatching.isMatch("mississippi", "mis*is*ip*."));
  }


  public boolean isMatch(String string, String pattern) {
    int patternLength = pattern.length();
    int j = 0;
    for (int index = 0; index < string.length(); index++) {
      if (j >= patternLength) {
        return false;
      } else {
        if (pattern.charAt(j) == string.charAt(index)) {
          j++;
        } else {
          if (pattern.charAt(j) == '.') {
            j++;
          } else if (j < patternLength - 2 && pattern.charAt(j + 1) == '*') {
            j++;
          } else if (j > 0 && pattern.charAt(j) == '*') {
            if (pattern.charAt(j - 1) != string.charAt(index)) {
              j++;
              index--;
            }
          } else {
            return false;
          }
        }
      }
    }
    return true;
  }
}
