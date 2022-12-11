int solution(int n, int k) {
  return (Integer.MAX_VALUE ^ (int) Math.pow(2, k-1)) & n;
}
