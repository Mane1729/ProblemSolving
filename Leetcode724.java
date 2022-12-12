public class Leetcode724 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i = 0; i < n; i++){
            rightSum += nums[i];
        }

        for(int i = 0; i < n; i++){
            rightSum -= nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}

/*
    Time complexity: O(n)

    Space complexity: O(1)
 */
