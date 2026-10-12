// ──────────────────────────────────────────────────
// Problem  : 2897. Apply Operations on Array to Maximize Sum of Squares
// Difficulty: Hard
// Tags     : Array, Hash Table, Greedy, Bit Manipulation
// Link     : https://leetcode.com/problems/apply-operations-on-array-to-maximize-sum-of-squares/
// Runtime  : 64 ms (beats 41%)
// Memory   : 80468000 (beats 59%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.List;

class Solution {
    public int maxSum(List<Integer> nums, int k) {
            int[] bitCount = new int[31];
                    
                            // Count the frequency of each bit position
                                    for (int num : nums) {
                                                for (int i = 0; i <= 30; i++) {
                                                                if ((num & (1 << i)) != 0) {
                                                                                    bitCount[i]++;
                                                                                                    }
                                                                                                                }
                                                                                                                        }
                                                                                                                                
                                                                                                                                        long totalSum = 0;
                                                                                                                                                long MOD = 1_000_000_007;
                                                                                                                                                        
                                                                                                                                                                // Greedily construct the k largest numbers
                                                                                                                                                                        for (int i = 0; i < k; i++) {
                                                                                                                                                                                    long currentNum = 0;
                                                                                                                                                                                                for (int bit = 30; bit >= 0; bit--) {
                                                                                                                                                                                                                if (bitCount[bit] > 0) {
                                                                                                                                                                                                                                    currentNum |= (1L << bit);
                                                                                                                                                                                                                                                        bitCount[bit]--;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                totalSum = (totalSum + (currentNum * currentNum) % MOD) % MOD;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                        return (int) totalSum;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            }