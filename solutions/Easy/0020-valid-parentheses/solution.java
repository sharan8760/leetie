// ──────────────────────────────────────────────────
// Problem  : 20. Valid Parentheses
// Difficulty: Easy
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/valid-parentheses/
// Runtime  : 3 ms (beats 86%)
// Memory   : 43116000 (beats 72%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public boolean isValid(String s) {
                Stack<Character> stack = new Stack<>();
                        
                                for (char c : s.toCharArray()) {
                                            // Push the corresponding closing bracket for every opening bracket
                                                        if (c == '(') {
                                                                        stack.push(')');
                                                                                    } else if (c == '{') {
                                                                                                    stack.push('}');
                                                                                                                } else if (c == '[') {
                                                                                                                                stack.push(']');
                                                                                                                                            } 
                                                                                                                                                        // If it's a closing bracket, check if it matches the top of the stack
                                                                                                                                                                    else if (stack.isEmpty() || stack.pop() != c) {
                                                                                                                                                                                    return false;
                                                                                                                                                                                                }
                                                                                                                                                                                                        }
                                                                                                                                                                                                                
                                                                                                                                                                                                                        // If the stack is empty at the end, all brackets were matched
                                                                                                                                                                                                                                return stack.isEmpty();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    }
