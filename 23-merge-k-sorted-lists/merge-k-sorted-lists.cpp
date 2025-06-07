
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        vector<int> desiredNumbers;
        for (int i = 0; i < lists.size(); i++) {
            ListNode* current = lists[i];
            while (current != nullptr) {
                desiredNumbers.push_back(current->val);
                current = current->next;
            }
        }
        sort(desiredNumbers.begin(), desiredNumbers.end());
        ListNode* dummy = new ListNode(0);
        ListNode* tail = dummy;

        for (int i = 0; i < desiredNumbers.size(); i++) {
            tail->next = new ListNode(desiredNumbers[i]);
            tail = tail->next;
        }

        return dummy->next;
    }
};