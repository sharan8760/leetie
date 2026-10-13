// ──────────────────────────────────────────────────
// Problem  : 3727. Maximum Alternating Sum of Squares
// Difficulty: Medium
// Tags     : Array, Greedy, Sorting
// Link     : https://leetcode.com/problems/maximum-alternating-sum-of-squares/
// Runtime  : 32 ms (beats 85%)
// Memory   : 135308000 (beats 42%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
            int n = nums.length;
                    long[] squares = new long[n];
                            
                                    for (int i = 0; i < n; i++) {
                                                long val = nums[i];
                                                            squares[i] = val * val;
                                                                    }
                                                                            
                                                                                    Arrays.sort(squares);
                                                                                            
                                                                                                    long totalScore = 0;
                                                                                                            int mid = n / 2;
                                                                                                                    
                                                                                                                            // Subtract the smaller half of the squares
                                                                                                                                    for (int i = 0; i < mid; i++) {
                                                                                                                                                totalScore -= squares[i];
                                                                                                                                                        }
                                                                                                                                                                
                                                                                                                                                                        // Add the larger half of the squares
                                                                                                                                                                                for (int i = mid; i < n; i++) {
                                                                                                                                                                                            totalScore += squares[i];
                                                                                                                                                                                                    }
                                                                                                                                                                                                            
                                                                                                                                                                                                                    return totalScore;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        }