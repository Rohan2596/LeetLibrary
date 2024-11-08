package leetcode.easy;

import java.util.HashSet;

/**
 * 217. Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Explanation:
 * All elements are distinct.
 *
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true

 * Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 *
 * */
public class ContainsDuplicate {

    public boolean checkDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1 ; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        return true;
                    }
            }
        }
        return false;
    }

    // faster Solution using hashsets
    public boolean checkDuplicate1(int[] nums) {

        HashSet<Integer> uniqueSets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
             boolean value = uniqueSets.add(nums[i]);
             if (value == false){
                 return true;
             }
        }
        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int nums[] = {1,2,3,5,6,7,1};
        System.out.println("Check Duplicate Using Arrays:- " +containsDuplicate.checkDuplicate(nums));
        System.out.println("Check Duplicate using HashSets:- "+ containsDuplicate.checkDuplicate1(nums));
    }
}
