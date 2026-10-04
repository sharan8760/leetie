// ──────────────────────────────────────────────────
// Problem  : 678. Valid Parenthesis String
// Difficulty: Medium
// Tags     : String, Dynamic Programming, Stack, Greedy, Bracket Sequences
// Link     : https://leetcode.com/problems/valid-parenthesis-string/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42704000 (beats 51%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public boolean checkValidString(String s) {
                int minOpen = 0;
                        int maxOpen = 0;
                                
                                        for (char c : s.toCharArray()) {
                                                    if (c == '(') {
                                                                    minOpen++;
                                                                                    maxOpen++;
                                                                                                } else if (c == ')') {
                                                                                                                minOpen--;
                                                                                                                                maxOpen--;
                                                                                                                                            } else { // c == '*'
                                                                                                                                                            minOpen--; // treat as ')'
                                                                                                                                                                            maxOpen++; // treat as '('
                                                                                                                                                                                        }
                                                                                                                                                                                                    
                                                                                                                                                                                                                // If the maximum possible open parentheses drops below 0, it's invalid
                                                                                                                                                                                                                            if (maxOpen < 0) {
                                                                                                                                                                                                                                            return false;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                // The minimum open parentheses can't be negative
                                                                                                                                                                                                                                                                                            if (minOpen < 0) {
                                                                                                                                                                                                                                                                                                            minOpen = 0;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                // If we can achieve exactly 0 open parentheses, it's valid
                                                                                                                                                                                                                                                                                                                                                        return minOpen == 0;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            }
