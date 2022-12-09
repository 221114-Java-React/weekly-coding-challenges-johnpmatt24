package com.revature.problem1;

import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;
        int result = k + 1;

        while (low <= high)
        {

            int mid = (low + high) / 2;

            if (arr[mid] <= result)
            {

                if (arr[mid] == result)
                {

                    result++;

                    high = arr.length - 1;
                }

                low = mid + 1;
            }
            else
                high = mid - 1;
        }

        return result;

    }
}
