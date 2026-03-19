class Solution {
    public String longestPalindrome(String s) {
        for (int len = s.length(); len > 0; len--) {
            for (int i = 0; i <= s.length() - len; i++) {
                String substr = s.substring(i, i + len);
                if (isPalindrome(substr)) return substr;
            }
        }
        return "";
    }
    
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
