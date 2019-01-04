package org.spituk.study.leet.solutions;

/**
 * Solution for Leet Code Question "Search Insert Position".
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/23/2018
 */
public class SearchInsertPosition {

  /**
   * Binary Search can be used for searching the insert position.
   */
  public int searchInsert(int[] numbers, int target) {
    int startIndex = 0;
    int endIndex = numbers.length - 1;
    int midIndex;
    while (startIndex <= endIndex) {
      midIndex = (endIndex - startIndex) / 2 + startIndex;
      if (numbers[midIndex] == target) {
        return midIndex;
      } else {
        if (numbers[midIndex] > target) {
          endIndex = midIndex - 1;
        } else {
          startIndex = midIndex + 1;
        }
      }
    }
    return startIndex;
  }

  public static void main(String[] args) {
    int[] numbers = {1, 3, 5, 6};
    SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
    System.out.println(searchInsertPosition.searchInsert(numbers, 5));
    System.out.println(searchInsertPosition.searchInsert(numbers, 7));
    System.out.println(searchInsertPosition.searchInsert(numbers, 4));
    System.out.println(searchInsertPosition.searchInsert(numbers, 0));
  }
}
