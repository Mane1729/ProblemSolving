// կատարել swap գործողություն թվի i և j բիթերը տեղափոխելու համար

public class Problem3 {
    public static int swapBits(int n, int i, int j){
	    if(((n >> i) & 1) != ((n >> j) & 1)){
	        return (1 << i) ^ (1 << j) ^ n;
	    }
	    
	    return n;
	}
}

/*
    Time complexity: O(1)
    
    Space complexity: O(1)
 */
