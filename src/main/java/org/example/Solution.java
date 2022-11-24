package org.example;

import java.util.Arrays;

public class Solution {
    public Solution(){

    }

    public int maximumGap(int[] nums) {

        int gaps = 0;
        int aux = 0;

        if (nums.length < 2){

            return gaps;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++){

           aux = nums[i+1] - nums[i];

           if (gaps < aux){

               gaps = aux;
           }

        }

        return gaps;

    }
}