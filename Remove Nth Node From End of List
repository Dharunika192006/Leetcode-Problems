/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode dummy = {0, head}; 

    struct ListNode *front = &dummy;    
    struct ListNode *back = &dummy; 

    
    for (int i = 0; i < n; i++) {
        front = front->next;
    }

    
    while (front->next != NULL) {
        front = front->next;
        back = back->next;
    }

    
    back->next = back->next->next;

   
    return dummy.next;

    
}
