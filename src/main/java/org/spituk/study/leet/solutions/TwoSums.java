package org.spituk.study.leet.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Solution for Leet Code Question "Two Sums".
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/23/2018
 */
public class TwoSums {

  /**
   * Maintain a map of the numbers traversed with their index.
   */
  public int[] twoSum(int[] numbers, int target) {
    int index = 0;
    int[] requiredNumbers = null;
    Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
    for (int number : numbers) {
      if (numbersMap.containsKey(target - number)) {
        requiredNumbers = new int[2];
        requiredNumbers[0] = numbersMap.get(target - number);
        requiredNumbers[1] = index;
        return requiredNumbers;
      } else {
        numbersMap.put(number, index);
        index++;
      }
    }
    return requiredNumbers;
  }

  public static void main(String[] args) {
    TwoSums twoSums = new TwoSums();
    int[] numbers = {2, 7, 11, 15};
    int target = 13;
    int[] requiredNumbers = twoSums.twoSum(numbers, target);
    System.out.println(Arrays.toString(requiredNumbers));
  }
}
