// ──────────────────────────────────────────────────
// Problem  : 2657. Find the Prefix Common Array of Two Arrays
// Difficulty: Medium
// Tags     : Array, Hash Table, Bit Manipulation
// Link     : https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
// Runtime  : 1 ms (beats 100%)
// Memory   : 47212000 (beats 72%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public int[] findThePrefixCommonArray(int[] A, int[] B) {
                int n = A.length;
                        int[] ans = new int[n];
                                int[] freq = new int[n + 1];
                                        
                                                int commonCount = 0;
                                                        for (int i = 0; i < n; i++) {
                                                                    // Process element from A
                                                                                freq[A[i]]++;
                                                                                            if (freq[A[i]] == 2) {
                                                                                                            commonCount++;
                                                                                                                        }
                                                                                                                                    
                                                                                                                                                // Process element from B
                                                                                                                                                            freq[B[i]]++;
                                                                                                                                                                        if (freq[B[i]] == 2) {
                                                                                                                                                                                        commonCount++;
                                                                                                                                                                                                    }
                                                                                                                                                                                                                
                                                                                                                                                                                                                            ans[i] = commonCount;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                    return ans;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        }
