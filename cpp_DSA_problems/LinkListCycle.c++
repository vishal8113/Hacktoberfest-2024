Question: In this question we are Breaking the cycle created in the Our Link List

#include<bits/stdc++.h>
using namespace std;
class Node
{
    public:
    int data;
    Node* next;
    Node ( int val)
    {
        int data=val;
        Node* next=NULL;
    }
};

void insertAthead(Node* &head,int data)
{
    Node* temp=new Node(data);
    temp-> next= head;
    temp=head;
   
}
void cycle(Node* &head,int a ,int b)
{
    
    int cnt1=0;
    int cnt2=0;
    Node* p1=head;
    Node* p2=head;
    while(p1!=NULL || p2!=NULL)
    {
        if(cnt1!=a)
        {
          p1=p1 -> next;
          cnt1++;
        }
        if(cnt2!=b)
        {
            p2=p2 -> next;
            cnt2++;
        }
        p2-> next=p1;
    }
}
  Node* detectCycle(Node* head) {
    Node* slow = head;
    Node* fast = head;

   
    while (fast != nullptr && fast->next != nullptr) {
        slow = slow->next;
        fast = fast->next->next;
        if (slow == fast) {
            break; 
        }
    }

    
    if (fast == NULL || fast->next == NULL) {
        return head;
    }

    
    slow = head;

   
    while (slow != fast) {
        slow = slow->next;
        fast = fast->next;
    }

    return slow ;
} 
 void  breakCycle(Node* head) {
    Node*  startOfLoop = detectCycle(head);
    
    if (startOfLoop == NULL) {
        return;
    }

    // Find the last node of the loop
    Node* lastNode = startOfLoop;
    while (lastNode->next != startOfLoop) {
        lastNode = lastNode->next;
    }

    lastNode->next = NULL;
}
void print(Node* &head)
 {
    Node* temp= head;
  
    while(temp!=NULL)
    {
          cout << temp -> data << " ->";
        temp=temp->next;
    }
    cout << endl;
 }

int main()
{
       Node* head = NULL;
   
    cycle(head,1,3);
     print(head);
    detectCycle(head);
    cout<< detectCycle << endl;
  breakCycle(head);
  print(head);

  
  
  

    // T.C ==> O(N)
    // S.C => O(1)
 //   cout << cycle(head) << endl;
    //cout <<  insertNode(head) << endl;
        return 0;
}
