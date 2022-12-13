// հաշվել թվի 1 արժեքով բիթերի քանակը

package bitwise_problems;

public class Problem1 {
    public static int numberOfOneBits(int n){
        int num = 0;
        while(n > 0){
            n &= n-1;
            num++;
        }

        return num;
    }
}

/*
    Time complexity: O(n)
    (depends on the number of 1 bits in the number)

    Space complexity: O(1)
 */
