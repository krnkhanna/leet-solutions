package org.spituk.study.leet.solutions;

import java.util.Arrays;

/**
 * Solution for Leet Code Question "Remove Element".
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/24/2018
 */
public class RemoveElement {

  /**
   * Maintain 2 pointers, copy element from fast index if element not equal to value to be removed.
   */
  public int removeElement(int[] numbers, int value) {
    int indexForRequiredArray = 0;
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] != value) {
        numbers[indexForRequiredArray++] = numbers[index];
      }
    }
    System.out.println(Arrays.toString(numbers));
    return indexForRequiredArray;
  }

  public static void main(String[] args) {
    int[] numbers = {4, 2, 2, 3};
    int value = 4;
    RemoveElement removeElement = new RemoveElement();
    System.out.println(removeElement.removeElement(numbers, value));
  }
}
