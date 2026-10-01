// ──────────────────────────────────────────────────
// Problem  : 1861. Rotating the Box
// Difficulty: Medium
// Tags     : Array, Two Pointers, Matrix
// Link     : https://leetcode.com/problems/rotating-the-box/
// Runtime  : 7 ms (beats 91%)
// Memory   : 124964000 (beats 29%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public char[][] rotateTheBox(char[][] boxGrid) {
                int m = boxGrid.length;
                        int n = boxGrid[0].length;
                                
                                        // Step 1: Apply gravity to each row
                                                for (int i = 0; i < m; i++) {
                                                            int emptySpot = n - 1; // Start from the rightmost position
                                                                        for (int j = n - 1; j >= 0; j--) {
                                                                                        if (boxGrid[i][j] == '*') {
                                                                                                            // Obstacle resets the lowest available empty spot
                                                                                                                                emptySpot = j - 1;
                                                                                                                                                } else if (boxGrid[i][j] == '#') {
                                                                                                                                                                    // Move the stone to the lowest available empty spot
                                                                                                                                                                                        boxGrid[i][j] = '.';
                                                                                                                                                                                                            boxGrid[i][emptySpot] = '#';
                                                                                                                                                                                                                                emptySpot--;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                    // Step 2: Rotate the box 90 degrees clockwise
                                                                                                                                                                                                                                                                                            char[][] rotatedBox = new char[n][m];
                                                                                                                                                                                                                                                                                                    for (int i = 0; i < m; i++) {
                                                                                                                                                                                                                                                                                                                for (int j = 0; j < n; j++) {
                                                                                                                                                                                                                                                                                                                                rotatedBox[j][m - 1 - i] = boxGrid[i][j];
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                                                    return rotatedBox;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        }
