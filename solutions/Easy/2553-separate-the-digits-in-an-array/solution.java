// ──────────────────────────────────────────────────
// Problem  : 2553. Separate the Digits in an Array
// Difficulty: Easy
// Tags     : Array, Simulation
// Link     : https://leetcode.com/problems/separate-the-digits-in-an-array/
// Runtime  : 7 ms (beats 24%)
// Memory   : 46336000 (beats 91%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {
            List<Integer> digitsList = new ArrayList<>();
                    
                            // Iterate through each number in the array
                                    for (int num : nums) {
                                                // Convert number to string to easily get digits in order
                                                            String s = String.valueOf(num);
                                                                        for (char c : s.toCharArray()) {
                                                                                        // Subtract '0' to convert the character back to an integer value
                                                                                                        digitsList.add(c - '0');
                                                                                                                    }
                                                                                                                            }
                                                                                                                                    
                                                                                                                                            // Convert the ArrayList back to an int[] array
                                                                                                                                                    int[] answer = new int[digitsList.size()];
                                                                                                                                                            for (int i = 0; i < digitsList.size(); i++) {
                                                                                                                                                                        answer[i] = digitsList.get(i);
                                                                                                                                                                                }
                                                                                                                                                                                        
                                                                                                                                                                                                return answer;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    }