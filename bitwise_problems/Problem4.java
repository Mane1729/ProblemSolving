// շրջել թվի բիթերը (reverse)

package bitwise_problems;

public class Problem4 {
    public static int reverseBits(int n){
        int result = 0;
        while(n > 0){
            result |= n & 1;
            result <<= 1;
            n >>= 1;
        }
        result >>= 1;

        return result;
    }
}

/*
    Time complexity: O(n)

    Space complexity: O(1)
 */
