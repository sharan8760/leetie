// ──────────────────────────────────────────────────
// Problem  : 1340. Jump Game V
// Difficulty: Hard
// Tags     : Array, Dynamic Programming, Sorting
// Link     : https://leetcode.com/problems/jump-game-v/
// Runtime  : 22 ms (beats 15%)
// Memory   : 47132000 (beats 11%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int maxJumps(int[] arr, int d) {
            int n = arr.length;
                    Integer[] indices = new Integer[n];
                            for (int i = 0; i < n; i++) {
                                        indices[i] = i;
                                                }
                                                        
                                                                // Sort indices based on their values in ascending order
                                                                        Arrays.sort(indices, Comparator.comparingInt(a -> arr[a]));
                                                                                
                                                                                        int[] dp = new int[n];
                                                                                                Arrays.fill(dp, 1);
                                                                                                        
                                                                                                                int maxJumps = 1;
                                                                                                                        
                                                                                                                                for (int i = 0; i < n; i++) {
                                                                                                                                            int idx = indices[i];
                                                                                                                                                        
                                                                                                                                                                    // Check left jumps
                                                                                                                                                                                for (int x = 1; x <= d && idx - x >= 0; x++) {
                                                                                                                                                                                                int nextIdx = idx - x;
                                                                                                                                                                                                                if (arr[nextIdx] >= arr[idx]) {
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    dp[idx] = Math.max(dp[idx], 1 + dp[nextIdx]);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                        // Check right jumps
                                                                                                                                                                                                                                                                                                                    for (int x = 1; x <= d && idx + x < n; x++) {
                                                                                                                                                                                                                                                                                                                                    int nextIdx = idx + x;
                                                                                                                                                                                                                                                                                                                                                    if (arr[nextIdx] >= arr[idx]) {
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                        dp[idx] = Math.max(dp[idx], 1 + dp[nextIdx]);
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                                                                            maxJumps = Math.max(maxJumps, dp[idx]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    return maxJumps;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }