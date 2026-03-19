

struct ListNode* reverseKGroup(struct ListNode* head, int k) {
    if (head == NULL || k == 1)
        return head;
    struct ListNode dummy;
    dummy.next = head;

    struct ListNode *prevGroupEnd = &dummy;

    while (1) {
        struct ListNode *kth = prevGroupEnd;
        for (int i = 0; i < k; i++) {
            kth = kth->next;
            if (kth == NULL)
                return dummy.next;   
        }
        struct ListNode *groupStart = prevGroupEnd->next;
        struct ListNode *curr = groupStart;
        struct ListNode *prev = kth->next;
        struct ListNode *next = NULL;

        for (int i = 0; i < k; i++) {
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        prevGroupEnd->next = prev;
        prevGroupEnd = groupStart;
    }
}
