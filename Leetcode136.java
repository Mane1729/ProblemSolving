public class Leetcode136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }

        return result;
    }
}

/*
    Time complexity: O(n)
    (iterates over the array and does XOR operation each time)

    Space complexity: O(1)
 */
