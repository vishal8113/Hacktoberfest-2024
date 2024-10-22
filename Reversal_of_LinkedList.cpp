#include <iostream>

struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(nullptr) {}
};

ListNode* reverseList(ListNode* head) {
    ListNode* prev = nullptr;
    ListNode* curr = head;
    while (curr) {
        ListNode* next_temp = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next_temp;
    }
    return prev;
}

void printList(ListNode* head) {
    while (head) {
        std::cout << head->val << " ";
        head = head->next;
    }
}

int main() {
    ListNode* head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    head->next->next->next = new ListNode(4);
    
    std::cout << "Original List: ";
    printList(head);
    
    head = reverseList(head);
    
    std::cout << "\nReversed List: ";
    printList(head);
    
    return 0;
}
