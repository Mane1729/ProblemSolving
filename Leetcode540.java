public class Leetcode540 {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        boolean isEven;
        int midValue = 0;

        while(left < right){
            mid = (left + right) / 2;
            isEven = mid % 2 == 0;
            midValue = nums[mid];

            if(isEven && midValue == nums[mid+1]){
                left = mid + 2;
            }
            else if(isEven && midValue == nums[mid-1]){
                right = mid - 2;
            }
            else if(!isEven && midValue == nums[mid+1]){
                right = mid - 1;
            }
            else if(!isEven && midValue == nums[mid-1]){
                left = mid + 1;
            }
            else{
                return midValue;
            }
        }

        // the case when left == right
        return nums[left];

    }
}

/*
    Time complexity: O(log n)
    (during each iteration the array is dividing in half)

    Space complexity: O(1)
 */
