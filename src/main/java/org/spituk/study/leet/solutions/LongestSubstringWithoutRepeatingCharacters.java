package org.spituk.study.leet.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for Leet Code Question "Longest Substring Without Repeating Characters".
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/24/2018
 */
public class LongestSubstringWithoutRepeatingCharacters {

  /**
   * Maintain a map of the characters with character as key and last position in the string as
   * value. If the character is repeated after the begin of the substring start the substring after
   * the location of the character.
   *
   * @return the length of the longest substring
   */
  public int lengthOfLongestSubstring(String string) {
    int max = 0;
    int begin = 0;
    int index = 0;
    Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
    for (char c : string.toCharArray()) {
      if (characterMap.containsKey(c) && characterMap.get(c) >= begin) {
        begin = characterMap.get(c) + 1;
      }
      characterMap.put(c, index);
      max = Math.max(max, index - begin + 1);
      index++;
    }
    return max;
  }

  public static void main(String[] args) {
    String testString = "abcabcbb";
    LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new
        LongestSubstringWithoutRepeatingCharacters();
    System.out
        .println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(testString));
  }
}
