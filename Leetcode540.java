public class Leetcode540 {
    if(nums.length == 1){
            return nums[0];
        }

        int left = 0; 
        int right = nums.length-1;
        int mid = 0;

        while(left < right){
            mid = (left + right) / 2;

            if(mid % 2 == 0 && nums[mid] == nums[mid+1]){
                left = mid + 2;
            }
            else if(mid % 2 == 0 && nums[mid] == nums[mid-1]){
                right = mid - 2;
            }
            else if(!(mid % 2 == 0) && nums[mid] == nums[mid+1]){
                right = mid - 1;
            }
            else if(!(mid % 2 == 0) && nums[mid] == nums[mid-1]){
                left = mid + 1;
            }
            else{
                return nums[mid];
            }
        }

        return nums[left];
    }
}

/*
    Time complexity: O(log n)
    (during each iteration the array is dividing in half)

    Space complexity: O(1)
 */
