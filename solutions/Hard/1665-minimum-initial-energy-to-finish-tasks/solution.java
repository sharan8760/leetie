// ──────────────────────────────────────────────────
// Problem  : 1665. Minimum Initial Energy to Finish Tasks
// Difficulty: Hard
// Tags     : Array, Greedy, Sorting
// Link     : https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/
// Runtime  : 2 ms (beats 96%)
// Memory   : 44192000 (beats 63%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Arrays;

class Solution {
    public int minimumEffort(int[][] tasks) {
            // Sort tasks by (minimum - actual) in descending order
                    Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
                            
                                    int initialEnergy = 0;
                                            int currentEnergy = 0;
                                                    
                                                            for (int[] task : tasks) {
                                                                        int actual = task[0];
                                                                                    int minimum = task[1];
                                                                                                
                                                                                                            // If we don't have enough energy to start this task, 
                                                                                                                        // we must retroactively add the deficit to our starting initialEnergy
                                                                                                                                    if (currentEnergy < minimum) {
                                                                                                                                                    initialEnergy += (minimum - currentEnergy);
                                                                                                                                                                    currentEnergy = minimum;
                                                                                                                                                                                }
                                                                                                                                                                                            
                                                                                                                                                                                                        // Spend the energy required for the task
                                                                                                                                                                                                                    currentEnergy -= actual;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                            return initialEnergy;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                }