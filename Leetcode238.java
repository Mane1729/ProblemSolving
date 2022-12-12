public class Leetcode238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        // prefix product
        int prefix = 1;
        for(int i = 0; i < n; i ++){
            answer[i] = prefix;
            prefix *= nums[i];
        }

        // postfix product
        int postfix = 1;
        for(int i = n-1; i >= 0; i--){
            answer[i] *= postfix;
            postfix *= nums[i];
        }

        return answer;
    }
}

/*
    Time complexity: O(n)

    Space complexity: O(n)
    (creating an array answer size of which depends on the size of the given array)
 */
