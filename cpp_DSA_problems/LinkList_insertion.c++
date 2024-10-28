#include<bits/stdc++.h>
using namespace std;
class Node
{
   public:
   int data;
   Node* next;
   Node(int val)
   {
    data=val;
    next=NULL;
   }
};
 void InsertAtHead(Node* &head, int data)
 {
    Node* temp = new Node(data);
    temp -> next= head;
head = temp;
 }
 void InsertAtTail(Node* &tail,int data)
 {
      Node* temp = new Node(data);
      tail -> next= temp;
      tail = tail -> next;
     
 }
 void InsertAtPosition(Node* &head,int position , int  data )
 {
    
   Node* temp = head;

     int cnt=1;
     while(cnt < position -1)
     {
      temp = temp -> next;
      cnt ++;
     }
     Node* newnode= new Node(data);
     newnode -> next= temp -> next;
     temp -> next= newnode;

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
      Node *node1 = new Node(5);
    // cout << node1 -> data << endl;
    // cout << node1 -> next << endl;

    Node* head = node1;
    print(head);

    InsertAtHead(head,8);
    print(head);

    InsertAtHead(head,10);
    print(head);

    InsertAtHead(head,20);
    print(head);

    Node* tail = node1;
    InsertAtTail(tail,30);
    print(head);

    InsertAtTail(tail,60);
    print(head);

    InsertAtHead(head,35);
    print(head);

    InsertAtPosition(head,4,100);
    print(head);

    InsertAtPosition(head,2,1008);
    print(head);
    return 0;
}
