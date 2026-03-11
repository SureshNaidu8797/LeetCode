class Solution {
    public int bitwiseComplement(int n) {
        if (n==0) return 1;
        return ~n & ((1 << (32 - Integer.numberOfLeadingZeros(n))) - 1);
    }
}