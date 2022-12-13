// ստուգել թվի 1 արժեքով բիթերի քանակը կենտ է թե զույգ

package bitwise_problems;

public class Problem2 {
    public static void evenOrOddOneBits(int n){
        // first division - 16 bits
        n ^= n >> 16;
        // 8 bits
        n ^= n >> 8;
        // 4 bits
        n ^= n >> 4;
        // 2 bits
        n ^= n >> 2;
        // 1 bit
        n ^= n >> 1;

        if((n & 1) == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}

/*
    Time complexity: O(1)

    Space complexity: O(1)
 */
