package org.leetcode.sep23;

import java.util.Arrays;

class Solution {
  public int searchInsert(int[] nums, int target) {
    Arrays.sort(nums);
    int idx = 0;
    for (int i = 0; i < nums.length; i++) {
      if (target == nums[i]) {
        return idx;
      }
      if (target > nums[i]) {
        idx++;
      }
    }
    return idx;
  }
}

public class SearchInsertPosition {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] array = new int[]{1, 3, 5, 6};
    int i = solution.searchInsert(array, 5);
    System.out.println(i);
  }
}
