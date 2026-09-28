// ──────────────────────────────────────────────────
// Problem  : 1614. Maximum Nesting Depth of the Parentheses
// Difficulty: Easy
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42824000 (beats 52%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public int maxDepth(String s) {
                int currentDepth = 0;
                        int maxDepth = 0;
                                
                                        for (int i = 0; i < s.length(); i++) {
                                                    char c = s.charAt(i);
                                                                if (c == '(') {
                                                                                currentDepth++;
                                                                                                maxDepth = Math.max(maxDepth, currentDepth);
                                                                                                            } else if (c == ')') {
                                                                                                                            currentDepth--;
                                                                                                                                        }
                                                                                                                                                }
                                                                                                                                                        
                                                                                                                                                                return maxDepth;
                                                                                                                                                                    }
                                                                                                                                                                    }
