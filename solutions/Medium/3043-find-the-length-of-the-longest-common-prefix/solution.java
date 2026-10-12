// ──────────────────────────────────────────────────
// Problem  : 3043. Find the Length of the Longest Common Prefix
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Trie
// Link     : https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/
// Runtime  : 77 ms (beats 47%)
// Memory   : 89848000 (beats 41%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.HashSet;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
            HashSet<Integer> prefixSet = new HashSet<>();
                    
                            // Insert all possible prefixes of numbers in arr1 into the HashSet
                                    for (int num : arr1) {
                                                while (num > 0) {
                                                                prefixSet.add(num);
                                                                                num /= 10;
                                                                                            }
                                                                                                    }
                                                                                                            
                                                                                                                    int maxLength = 0;
                                                                                                                            
                                                                                                                                    // Check all possible prefixes of numbers in arr2 against the HashSet
                                                                                                                                            for (int num : arr2) {
                                                                                                                                                        while (num > 0) {
                                                                                                                                                                        if (prefixSet.contains(num)) {
                                                                                                                                                                                            // Calculate the length of the current matching prefix
                                                                                                                                                                                                                int length = String.valueOf(num).length();
                                                                                                                                                                                                                                    maxLength = Math.max(maxLength, length);
                                                                                                                                                                                                                                                        break; // Since we check from longest to shortest prefix, we can break early
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        num /= 10;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                            return maxLength;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                }