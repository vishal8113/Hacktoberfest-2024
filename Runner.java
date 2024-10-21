package Lecture1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
	int data;  
	Node next;  
	static int count = 0; 
 

 // Constructor to create a node with given data
	Node(int data) {
		this.data = data;
		count++;
	}

 // Constructor to create a node with given data and next reference
	Node(int data, Node next) {
		this.data = data;
		this.next = next;  // Set the next reference to the given node
	}
}


public class Runner {
	
    public static Node insert(int x, Node start) {
    	Node.count++;
        if (start == null || start.data > x) {
            start = new Node(x, start);  
            return start;
        }

        Node p = start;  
        while (p.next != null) {
            if (p.next.data > x) {  
                break;
            }
            p = p.next; 
        }
        p.next = new Node(x, p.next);
        return start; 
    }
    	public static void getSize() {
    		System.out.println("Size of list is "+Node.count);
    	}
    	
    	public static int sum(Node start) {
    		Node p = start;
    		int sum = 0;
    		while(p != null) {
    			sum += p.data;
    			p = p.next;
    		}
    		return sum;
    	}
    	
    	public static int avg(Node start) {
    		int sum = sum(start);
    		return sum/Node.count;
    		
    	}
    	
    	public static int printLast(Node start) {
    		Node p = start;
    		if(p == null) {
    			System.out.println("List is empty");
    		}
    		while(p.next != null) {
    			p = p.next;
    		}
    		return p.data;
    	}
    	
    	public static void evenPosition(Node start) {
    		Node p = start;
    		int position = 0;
    		while(p != null) {
    			if(position % 2 == 0) {
    				System.out.println(p.data);
    			}
    			position ++;
    			p = p.next;
    		}
    	}
    	public static void oddPosition(Node start) {
    		Node p = start;
    		int position = 0;
    		while(p != null) {
    			if(position % 2 != 0) {
    				System.out.println(p.data);
    			}
    			position ++;
    			p = p.next;
    		}
    	}
    	
    	public static Node delete(int x, Node start) {
    		if(start == null || start.data > x) { // x is not in the list
    			return start;
    		}
    		
    		if(start.data == x) { // x is first element in the list
    			return start.next;
    		}
    		
    		for(Node p = start; p.next != null; p = p.next) {
    			if(p.next.data > x ) {// x is not in the list
    				break;
    			}
    			if(p.next.data == x) { // x is in the p.next node
    				p.next = p.next.next; // delete the node
    				break;
    			}
    		}
    		
    		return start;
    	}
    	// special method to only delete last element 
    	public static void deleteLast(Node start) {
    		if(start == null) {
    			System.out.println("List is empty");
    			return;
    		}
    		Node.count--;
    		if(start.next == null) {
    			start = null;
    			return;
    		}
    		
    		Node secondLast = start;
    		Node lastNode = start.next;
    		
    		while(lastNode.next != null) {
    			lastNode = lastNode.next;
    			secondLast = secondLast.next;
    		}
    		
    		secondLast.next = null;
    		
    	}
    	
    	public static void deleteFirst(Node start) {
    		if(start == null) {
    			System.out.println("List is empty");
    			return;
    		}
    		Node.count--;
    		start = start.next;
    		
    	}
    	
  
    	
    	public static Node mergeLists1(Node list1, Node list2) {
    		Node dummy = new Node(0);
    		Node current = dummy;
    		while(list1 != null && list2 != null) {
    			if(list1.data < list2.data) {
    				current.next = list1;
    				list1 = list1.next;
    			}
    			else {
    				current.next = list2;
    				list2 = list2.next;
    			}
    			current.next = list2;
    			if(list1 != null) {
    				current.next = list2;
    			}
    			else {
    				current.next = list2;
    			}
    		}
    		return dummy.next;
    	}
    	
    	public static Node mergeList(Node list1, Node list2) {
    		for(Node q = list2; q != null; q = q.next) {
    			list1 = insert(q.data, list1);
    		}
    		return list1;
    	}
    	
    	public static Node clone(Node p) {
    		Node q = new Node(p.data);
    		
    		Node temp = q;
    		
    		p = p.next;
    		
    		while(p != null) {
    			temp.next = new Node(p.data);
    			temp = temp.next;
    			p = p.next;
    		}
    		
    		return q;
    		
    	}
    	
    	public static Node sublist(int noOfElements, Node start) {
    		int i = 0;
    		Node dummy = new Node(start.data);
    		
    		Node p = dummy;
    		start = start.next;
    		
    		while(start != null && i < noOfElements) {
    			p.next = new Node(start.data);
    			start = start.next;
    			p = p.next;
    			i++;
    		}
    		return dummy;
    	}
    	static void evenOddFilter(Node start){
            System.out.println("Even");
            for (Node q=start;q!=null;q=q.next){
                if(q.data%2==0){
                    System.out.print(q.data+ " ");
                }
            }
            System.out.println("Odd");
            for (Node q=start;q!=null;q=q.next){
                if(q.data%2!=0){
                    System.out.print(q.data+ " ");
                }
            }
            
        }
        public static Node sublist(int intialPos,int finalPos,Node start){
    		int i=intialPos;
            int counter=0;
    		Node p=start;
    		while(p!=null){
    			if(counter==i)
    				break;
    			counter++;
    			p=p.next;
    		}
    		Node q=new Node(p.data);
    		Node temp=q;
    		p=p.next;
    		while(p!=null && i<finalPos){
    			temp.next=new Node(p.data);
    			temp=temp.next;
    			p=p.next;
                i++;
    		}
    		return q;
    	}
    	public static List<Node> splitIntoNLists(Node start) {
            List<Node> lists = new ArrayList<>();
            Node current = start;
            while (current != null) {
                lists.add(new Node(current.data));
                current = current.next;
            }
            return lists;
        }
    	
    	public static void printRandomized(Node start) {
            List<Integer> values = new ArrayList<>();
            Node current = start;
            while (current != null) {
                values.add(current.data);
                current = current.next;
            }
            Collections.shuffle(values);
            for (int value : values) {
                System.out.println(value);
            }
        }
    	
    	public static void reverse(Node start) {
    		
    	}
    	
    	public static Node[] splitList(Node start, int k) {
    	    if (k <= 0) {
    	        throw new IllegalArgumentException("Number of parts must be greater than zero");
    	    }

    	    // Step 1: Calculate the length of the list
    	    int length = 0;
    	    Node current = start;
    	    while (current != null) {
    	        length++;
    	        current = current.next;
    	    }

    	    // Step 2: Calculate base size and extra nodes
    	    int baseSize = length / k;      // Base number of nodes in each part
    	    int extraNodes = length % k;    // Number of parts that will get an extra node

    	    Node[] parts = new Node[k];
    	    current = start;

    	    for (int i = 0; i < k; i++) {
    	        parts[i] = current;  // Start of the current part
    	        int nodesInThisPart = baseSize;

    	        // Distribute extra nodes to the first 'extraNodes' parts
    	        if (extraNodes > 0) {
    	            nodesInThisPart++;
    	            extraNodes--;
    	        }

    	        // Move to the last node of the current part
    	        for (int j = 0; j < nodesInThisPart - 1; j++) {
    	            if (current != null) {
    	                current = current.next;
    	            }
    	        }

    	        // Disconnect the current part from the next part
    	        if (current != null) {
    	            Node nextPartStart = current.next;
    	            current.next = null;
    	            current = nextPartStart;
    	        }
    	    }

    	    return parts;
    	}
    	
    
    
      

    public static void main(String[] args) {
        // Constructing a linked list part 1
        Node start = new Node(1);  // Create the start node with data 22
        Node p = start;  // Pointer to construct the list
        p = p.next;
        for(int i = 2; i <= 11; i++ ) {
        	
        	p = insert(i,start);
        	p = p.next;
        }
        start = delete(1, start);
        
        for(Node q = start; q != null; q = q.next) {
        	System.out.print(q.data+"  ");
        }
        System.out.println();
        Node[]  parts = splitList(start, 3);
        
        for (int i = 0; i < parts.length; i++) {
            System.out.print("Part " + (i + 1) + ": ");
            Node current = parts[i];
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

//        // Add nodes with data 33, 44, 55, 66
//        for (int i = 0; i < 4; i++) {
//            p.next = new Node(33 + 11 * i);  // Create a new node and link it to the current list
//            p = p.next;  // Move the pointer to the newly created node
//        }
//
//        // Reset p to start to traverse the list from the beginning
//        p = start;
//
//        // Print the list using a while loop
//        System.out.println("Using while loop");
//        while (p != null) {
//            System.out.println(p.data);  // Print the data of the current node
//            p = p.next;  // Move to the next node
//        }
//
//        // Print the list using a for loop
//        System.out.println("Using for loop");
//        for (Node q = start; q != null; q = q.next) {
//            System.out.println(q.data);  // Print the data of the current node
//        }
//
//        // Reset p to start for further operations
//        p = start;
//
//        start = Runner.insert(25, start);  
//        start = Runner.insert(15, start);  
//        start = Runner.insert(45, start);  
//
//        System.out.println("After insertion:");
//        for (Node q = start; q != null; q = q.next) {
//            System.out.println(q.data);  
//        }
//        
//        Runner.getSize();
//        
//        
//        System.out.println(sum(start));
//        
//        System.out.println(avg(start));
//        
//        System.out.println(printLast(start));
//        
//        System.out.println("Even positions : ");
//        Runner.evenPosition(start);
//        
//        System.out.println("Odd positions : ");
//        Runner.oddPosition(start);
//        
//        System.out.println("Deleting 33 and 66");
//        Runner.delete(33, start);
//        Runner.delete(66, start);
//        
//        p =start;
//        while(p != null) {
//        	System.out.println(p.data);
//        	p = p.next;
//        }
//        
//        System.out.println("Delete first");
//        Runner.deleteFirst(start);
//        p =start;
//        while(p != null) {
//        	System.out.println(p.data);
//        	p = p.next;
//        }
//        System.out.println("Delete last");
//        Runner.deleteLast(start);
//        p =start;
//        System.out.println("Kaisa Dia?...");
//        while(p != null) {
//        	System.out.println(p.data);
//        	p = p.next;
//        }
//        
//        Node start2 = new Node(36);
//        start2 = Runner.insert(21, start2);  
//        start2 = Runner.insert(64, start2);  
//        start2 = Runner.insert(23, start2); 
//        
//        Runner.mergeList(start, start2);
//        p = start;
//        System.out.println("Nahi dia acha?");
//        while( p != null) {
//        	System.out.println(p.data);
//        	p = p.next;
//        }
//        
//        System.out.println("cloning given list ...");
//        p = start;
//        while( p != null) {
//        	System.out.println(p.data + "  "+p);
//        	p = p.next;
//        }
//        Node newNode = Runner.clone(start);
//        Node temp = newNode;
//        System.out.println("List cloned successfully");
//        while(temp != null) {
//        	System.out.println(temp.data + "  " + temp);
//        	temp = temp.next;
//        }
//        p = start;
//        System.out.println("Original Node");
//        while(p != null) {
//        	System.out.println(p.data);
//        	p = p.next;
//        }
//        
//        Node dummy = Runner.sublist(4, start);
//        System.out.println("Dummy Node");
//        for(Node q = dummy; q != null; q = q.next) {
//        	System.out.println(q.data+"  ");
//        }
//        p = start;
//        System.out.println("Original Node");
//        while(p != null) {
//        	System.out.println(p.data);
//        	p = p.next;
//        }
//        
//        System.out.println("Randomized list:");
//        Runner.printRandomized(start);
//
//        List<Node> individualLists = Runner.splitIntoNLists(start);
//        System.out.println("Individual lists:");
//        for (Node list : individualLists) {
//            for (Node q = list; q != null; q = q.next) {
//                System.out.println(q.data);
//            }
//        }
        
        
    }
}

