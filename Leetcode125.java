public class Leetcode125 {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        char cl;
        char cr;
        while(l < r){
            while(!Character.isLetterOrDigit(s.charAt(l)) && l < r){
                l++;
            }
            while(!Character.isLetterOrDigit(s.charAt(r)) && l < r){
                r--;
            }
            cl = Character.toLowerCase(s.charAt(l));
            cr = Character.toLowerCase(s.charAt(r));

            if(cl != cr){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}

/*
    Time complexity: O(n)

    Space complexity: O(1)
 */
