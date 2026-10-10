// ──────────────────────────────────────────────────
// Problem  : 1306. Jump Game III
// Difficulty: Medium
// Tags     : Array, Depth-First Search, Breadth-First Search
// Link     : https://leetcode.com/problems/jump-game-iii/
// Runtime  : 1 ms (beats 22%)
// Memory   : 48440000 (beats 63%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public boolean canReach(int[] arr, int start) {
            int n = arr.length;
                    boolean[] visited = new boolean[n];
                            Queue<Integer> queue = new LinkedList<>();
                                    
                                            queue.offer(start);
                                                    visited[start] = true;
                                                            
                                                                    while (!queue.isEmpty()) {
                                                                                int curr = queue.poll();
                                                                                            
                                                                                                        // If we reach an index with value 0, return true
                                                                                                                    if (arr[curr] == 0) {
                                                                                                                                    return true;
                                                                                                                                                }
                                                                                                                                                            
                                                                                                                                                                        // Possible next jump positions
                                                                                                                                                                                    int next1 = curr + arr[curr];
                                                                                                                                                                                                int next2 = curr - arr[curr];
                                                                                                                                                                                                            
                                                                                                                                                                                                                        // Check positive jump
                                                                                                                                                                                                                                    if (next1 < n && !visited[next1]) {
                                                                                                                                                                                                                                                    visited[next1] = true;
                                                                                                                                                                                                                                                                    queue.offer(next1);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                        // Check negative jump
                                                                                                                                                                                                                                                                                                                    if (next2 >= 0 && !visited[next2]) {
                                                                                                                                                                                                                                                                                                                                    visited[next2] = true;
                                                                                                                                                                                                                                                                                                                                                    queue.offer(next2);
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                        return false;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            }