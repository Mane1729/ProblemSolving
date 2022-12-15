// ստուգել թվի 1 արժեքով բիթերի քանակը կենտ է թե զույգ

package bitwise_problems;

public class Problem2 {
    public static void evenOrOddOneBits(int n){
        int half = 16;
		while(half > 0){
		    n ^= n >> half;
		    half /= 2;
		}

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
