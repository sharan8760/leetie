// ──────────────────────────────────────────────────
// Problem  : 1674. Minimum Moves to Make Array Complementary
// Difficulty: Medium
// Tags     : Array, Hash Table, Prefix Sum
// Link     : https://leetcode.com/problems/minimum-moves-to-make-array-complementary/
// Runtime  : 6 ms (beats 100%)
// Memory   : 76296000 (beats 74%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public int minMoves(int[] nums, int limit) {
                int n = nums.length;
                        // The maximum possible sum is 2 * limit.
                                // We need size 2 * limit + 2 to safely accommodate B + limit + 1
                                        int[] delta = new int[2 * limit + 2];
                                                
                                                        for (int i = 0; i < n / 2; i++) {
                                                                    int A = Math.min(nums[i], nums[n - 1 - i]);
                                                                                int B = Math.max(nums[i], nums[n - 1 - i]);
                                                                                            
                                                                                                        // Sweep Line / Difference array updates
                                                                                                                    delta[2] += 2;
                                                                                                                                delta[A + 1] -= 1;
                                                                                                                                            delta[A + B] -= 1;
                                                                                                                                                        delta[A + B + 1] += 1;
                                                                                                                                                                    delta[B + limit + 1] += 1;
                                                                                                                                                                            }
                                                                                                                                                                                    
                                                                                                                                                                                            int minMoves = n;
                                                                                                                                                                                                    int currentMoves = 0;
                                                                                                                                                                                                            
                                                                                                                                                                                                                    // Calculate the prefix sum to find the min moves across all valid targets
                                                                                                                                                                                                                            for (int T = 2; T <= 2 * limit; T++) {
                                                                                                                                                                                                                                        currentMoves += delta[T];
                                                                                                                                                                                                                                                    minMoves = Math.min(minMoves, currentMoves);
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                            return minMoves;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                }
