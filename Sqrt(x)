class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 2, right = x / 2;
        int ans = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long num = (long) mid * mid; // Use long to prevent overflow

            if (num == x) {
                return mid;
            } else if (num < x) {
                ans = mid; // Potential answer, but keep looking for a larger one
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
