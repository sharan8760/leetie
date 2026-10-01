// ──────────────────────────────────────────────────
// Problem  : 3660. Jump Game IX
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/jump-game-ix/
// Runtime  : 5 ms (beats 83%)
// Memory   : 198752000 (beats 46%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public int[] maxValue(int[] nums) {
                int n = nums.length;
                        
                                // Step 1: Calculate suffix minimums
                                        // suffixMin[i] stores the minimum value in the subarray nums[i...n-1]
                                                int[] suffixMin = new int[n];
                                                        suffixMin[n - 1] = nums[n - 1];
                                                                for (int i = n - 2; i >= 0; i--) {
                                                                            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
                                                                                    }
                                                                                            
                                                                                                    int[] ans = new int[n];
                                                                                                            int prefixMax = 0;
                                                                                                                    int compStart = 0;
                                                                                                                            int compMax = 0;
                                                                                                                                    
                                                                                                                                            // Step 2: Iterate to find connected components
                                                                                                                                                    for (int i = 0; i < n; i++) {
                                                                                                                                                                prefixMax = Math.max(prefixMax, nums[i]);
                                                                                                                                                                            compMax = Math.max(compMax, nums[i]);
                                                                                                                                                                                        
                                                                                                                                                                                                    // A cut happens when the maximum of the prefix is less than or equal to 
                                                                                                                                                                                                                // the minimum of the suffix. This means no valid jumps can cross this boundary.
                                                                                                                                                                                                                            if (i == n - 1 || prefixMax <= suffixMin[i + 1]) {
                                                                                                                                                                                                                                            // We've found a fully isolated connected component. 
                                                                                                                                                                                                                                                            // Every index in this component can reach the maximum value inside it.
                                                                                                                                                                                                                                                                            for (int j = compStart; j <= i; j++) {
                                                                                                                                                                                                                                                                                                ans[j] = compMax;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                // Reset trackers for the next component
                                                                                                                                                                                                                                                                                                                                                                compStart = i + 1;
                                                                                                                                                                                                                                                                                                                                                                                compMax = 0;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                                                                                                    return ans;
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                        }
