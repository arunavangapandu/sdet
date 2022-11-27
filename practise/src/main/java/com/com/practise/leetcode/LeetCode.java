package com.com.practise.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {

   /* public static int[] twoSum(int[] nums, int target) {
        return Arrays.stream(nums).filter(i -> nums[i] + nums[i+1] == target
        ).toArray();
    }
*/
   public static int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> hm = new HashMap<>();

       for(int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];
           if(hm.containsKey(complement)){
               return new int[] {i, hm.get(complement)};
           } else {
               hm.put(nums[i], i);
           }
       }
       return null;
   }

    public static int maxProfit(int[] prices) {
        int  buyPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice)
                buyPrice = prices[i];
            else {
                maxProfit = Math.max(maxProfit, prices[i]- buyPrice) ;
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = (twoSum(new int[] {2,7,11,15}, 18));
        // [3,2,3]
       // [2,7,11,15]  ---> Test Data
        //Arrays.stream(arr).forEach(System.out::println);
        System.out.println(Arrays.toString(arr));
        System.out.println(maxProfit(new int[] {2,4,1,5,4}));
    }
}
