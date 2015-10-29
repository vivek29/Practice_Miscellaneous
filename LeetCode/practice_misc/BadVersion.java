package practice_misc;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class BadVersion {
	
public int firstBadVersion(int n) {
        												// 1.2.3.n=10(total 9 elements), mid should be 5 
        int lower = 1, upper = n, mid;
        while (lower <= upper) {
            mid = lower + (upper-lower) / 2;
            if (isBadVersion(mid))
                upper = mid - 1;
            else
                lower = mid + 1;
        }
        return lower;
    }


private boolean isBadVersion(int mid) {
//	return if version is bad(true) or not(false);
	return false;

}

}
