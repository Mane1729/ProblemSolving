public class Codesignal_core17{
  int solution(int n, int k) {
    // previous solution
//      return (Integer.MAX_VALUE ^ (int) Math.pow(2, k-1)) & n;

    return n & ~(1 << k - 1);
  }
}

/*
    Time complexity: O(1)

    Space complexity: O(1)
 */
