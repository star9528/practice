import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        int max = 1;
        int count = 1;
        for (int i = 0;i < nums.length - 1;i++) {
            if(nums[i] + 1 == nums[i + 1]) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else if (nums[i] == nums[i + 1]) {
                ;
            } else {
                count = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,0,1};
        System.out.println(s.longestConsecutive(arr));
    }
}