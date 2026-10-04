// ──────────────────────────────────────────────────
// Problem  : 2770. Maximum Number of Jumps to Reach the Last Index
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/
// Runtime  : 12 ms (beats 89%)
// Memory   : 47032000 (beats 41%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Arrays;

class Solution {
    public int maximumJumps(int[] nums, int target) {
            int n = nums.length;
                    int[] dp = new int[n];
                            
                                    // Initialize dp array with -1 to represent unreachable states
                                            Arrays.fill(dp, -1);
                                                    dp[0] = 0; 
                                                            
                                                                    for (int i = 0; i < n; i++) {
                                                                                // If the current index is unreachable, skip it
                                                                                            if (dp[i] == -1) continue;
                                                                                                        
                                                                                                                    // Try jumping to all subsequent indices
                                                                                                                                for (int j = i + 1; j < n; j++) {
                                                                                                                                                if (Math.abs(nums[j] - nums[i]) <= target) {
                                                                                                                                                                    dp[j] = Math.max(dp[j], dp[i] + 1);
                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                        }
                                                                                                                                                                                                                
                                                                                                                                                                                                                        return dp[n - 1];
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            }