public class BitManipulation {
    // 1. հաշվել թվի 1 արժեքով բիթերի քանակը
    public static int numberOfOneBits(int n){
        int num = 0;
        while(n > 0){
            n &= n-1;
            num++;
        }

        return num;
    }
    /*
        Time complexity: O(n)
        (depends on the number of 1 bits in the number)

        Space complexity: O(1)
     */


    // 2. ստուգել թվի 1 արժեքով բիթերի քանակը կենտ է թե զույգ
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

    /*
        Time complexity: O(1)

        Space complexity: O(1)
     */


    // 4. շրջել թվի բիթերը (reverse)
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

    /*
        Time complexity: O(n)

        Space complexity: O(1)
     */

}
