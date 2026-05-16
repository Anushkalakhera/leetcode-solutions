class Solution {
    public int longestPalindrome(String s) {
        
        int[] freq = new int[128];

        // Count frequency of each character
        for(char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int length = 0;

        for(int count : freq) {
            
            // Add even part
            length += (count / 2) * 2;

            // If length is even and count is odd,
            // place one odd character in center
            if(length % 2 == 0 && count % 2 == 1) {
                length++;
            }
        }

        return length;
    }
}