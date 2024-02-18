package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};
        List<List<Integer>> triplets = threeSum(nums);
        System.out.println(triplets);
    }
    static  public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1 ; i++) {
            if(i == 0 || (nums[i] != nums[i-1])) {
                int sum = -nums[i];
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    while (start != 0 && nums[start] == nums[start-1]) start++;
                    while (end != nums.length-1 && nums[end] == nums[end+1]) end++;
                    if (nums[start] + nums[end] < sum)
                        start++;
                    else if (nums[start] + nums[end] > sum)
                        end--;
                    else {
                        list.add(Arrays.asList(nums[i] , nums[start] , nums[end]));
                        start++;
                        end--;
                    }
                }
            }
        }
        return list;

    }

}
