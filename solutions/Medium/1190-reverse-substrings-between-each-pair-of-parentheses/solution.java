// ──────────────────────────────────────────────────
// Problem  : 1190. Reverse Substrings Between Each Pair of Parentheses
// Difficulty: Medium
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
// Runtime  : 1 ms (beats 100%)
// Memory   : 42884000 (beats 91%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String reverseParentheses(String s) {
            int n = s.length();
                    int[] pair = new int[n];
                            Deque<Integer> stack = new ArrayDeque<>();

                                    // Step 1: Pair up matching parentheses
                                            for (int i = 0; i < n; i++) {
                                                        if (s.charAt(i) == '(') {
                                                                        stack.push(i);
                                                                                    } else if (s.charAt(i) == ')') {
                                                                                                    int j = stack.pop();
                                                                                                                    pair[i] = j;
                                                                                                                                    pair[j] = i;
                                                                                                                                                }
                                                                                                                                                        }

                                                                                                                                                                // Step 2: Traverse and teleport across parentheses
                                                                                                                                                                        StringBuilder result = new StringBuilder();
                                                                                                                                                                                for (int curr = 0, dir = 1; curr < n; curr += dir) {
                                                                                                                                                                                            char c = s.charAt(curr);
                                                                                                                                                                                                        if (c == '(' || c == ')') {
                                                                                                                                                                                                                        curr = pair[curr]; // Jump to matching parenthesis
                                                                                                                                                                                                                                        dir = -dir;        // Reverse direction
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                    result.append(c);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                return result.toString();
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    