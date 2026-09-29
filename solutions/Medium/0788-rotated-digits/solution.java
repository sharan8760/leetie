// ──────────────────────────────────────────────────
// Problem  : 788. Rotated Digits
// Difficulty: Medium
// Tags     : Math, Dynamic Programming
// Link     : https://leetcode.com/problems/rotated-digits/
// Runtime  : 4 ms (beats 83%)
// Memory   : 42148000 (beats 56%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public int rotatedDigits(int n) {
                int count = 0;
                        for (int i = 1; i <= n; i++) {
                                    if (isGood(i)) {
                                                    count++;
                                                                }
                                                                        }
                                                                                return count;
                                                                                    }

                                                                                        private boolean isGood(int num) {
                                                                                                boolean hasChanged = false;
                                                                                                        while (num > 0) {
                                                                                                                    int d = num % 10;
                                                                                                                                if (d == 3 || d == 4 || d == 7) {
                                                                                                                                                return false; // Invalid digit
                                                                                                                                                            }
                                                                                                                                                                        if (d == 2 || d == 5 || d == 6 || d == 9) {
                                                                                                                                                                                        hasChanged = true; // Rotates to a different valid digit
                                                                                                                                                                                                    }
                                                                                                                                                                                                                num /= 10;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                return hasChanged;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    }
