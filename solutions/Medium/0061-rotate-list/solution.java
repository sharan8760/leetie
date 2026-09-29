// ──────────────────────────────────────────────────
// Problem  : 61. Rotate List
// Difficulty: Medium
// Tags     : Linked List, Two Pointers
// Link     : https://leetcode.com/problems/rotate-list/
// Runtime  : 0 ms (beats 100%)
// Memory   : 44316000 (beats 44%)
// Language : java
// Copyright: (c) 2026 sharan8760. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public ListNode rotateRight(ListNode head, int k) {
                // Handle edge cases
                        if (head == null || head.next == null || k == 0) {
                                    return head;
                                            }
                                                    
                                                            // Step 1: Find the length of the list and the tail node
                                                                    ListNode tail = head;
                                                                            int length = 1;
                                                                                    while (tail.next != null) {
                                                                                                tail = tail.next;
                                                                                                            length++;
                                                                                                                    }
                                                                                                                            
                                                                                                                                    // Step 2: Form a circular linked list
                                                                                                                                            tail.next = head;
                                                                                                                                                    
                                                                                                                                                            // Step 3: Calculate effective rotations
                                                                                                                                                                    k = k % length;
                                                                                                                                                                            
                                                                                                                                                                                    // Step 4: Find the new tail (which is length - k - 1 steps from the head)
                                                                                                                                                                                            int stepsToNewTail = length - k - 1;
                                                                                                                                                                                                    ListNode newTail = head;
                                                                                                                                                                                                            for (int i = 0; i < stepsToNewTail; i++) {
                                                                                                                                                                                                                        newTail = newTail.next;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                // Step 5: Break the cycle to get the new head
                                                                                                                                                                                                                                                        ListNode newHead = newTail.next;
                                                                                                                                                                                                                                                                newTail.next = null;
                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                return newHead;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    }
