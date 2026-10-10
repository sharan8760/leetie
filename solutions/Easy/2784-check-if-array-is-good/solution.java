// ──────────────────────────────────────────────────
// Problem  : 2784. Check if Array is Good
// Difficulty: Easy
// Tags     : Array, Hash Table, Sorting
// Link     : https://leetcode.com/problems/check-if-array-is-good/
// Runtime  : 1 ms (beats 93%)
// Memory   : 44716000 (beats 59%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public boolean isGood(int[] nums) {
                int n = 0;
                        for (int num : nums) {
                                    n = Math.max(n, num);
                                            }
                                                    
                                                            // A valid base[n] array must have a length of n + 1
                                                                    if (nums.length != n + 1) {
                                                                                return false;
                                                                                        }
                                                                                                
                                                                                                        int[] count = new int[n + 1];
                                                                                                                for (int num : nums) {
                                                                                                                            if (num > n) return false;
                                                                                                                                        count[num]++;
                                                                                                                                                }
                                                                                                                                                        
                                                                                                                                                                // Numbers from 1 to n-1 must appear exactly once
                                                                                                                                                                        for (int i = 1; i < n; i++) {
                                                                                                                                                                                    if (count[i] != 1) {
                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                        // The number n must appear exactly twice
                                                                                                                                                                                                                                                return count[n] == 2;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    }
