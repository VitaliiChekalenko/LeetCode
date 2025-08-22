package org.example;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }
    public int binarySearch(int l, int r){
        if(l >= r)
            return l;
        int m = l + (r-l) / 2;
        if(isBadVersion(m))
            return binarySearch(l, m);
        else
            return binarySearch(m+1, r);
    }
}