class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. Quick check: Lengths must match
        if (s.length() != t.length()) {
            return false;
        }

        // 2. Create the Map
        Map<Character, Integer> charCounts = new HashMap<>();

        // 3. Loop through both strings simultaneously
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Increment count for character in 's'
            // If key doesn't exist, start at 0, then add 1
            charCounts.put(charS, charCounts.getOrDefault(charS, 0) + 1);

            // Decrement count for character in 't'
            // If key doesn't exist, start at 0, then subtract 1
            charCounts.put(charT, charCounts.getOrDefault(charT, 0) - 1);
        }

        // 4. Verify all counts are zero
        for (int count : charCounts.values()) {
            if (count != 0) {
                return false; // Found a mismatch
            }
        }

        return true;
    }
}