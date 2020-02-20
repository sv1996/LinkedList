import java.util.Scanner;

public class MoveToLast {
	
	public static Node<Integer> moveToLast(Node<Integer> head , int key){
	     // Node to keep pointing to tail 
	      Node<Integer> tail = head; 
	  
	        if (head == null) { 
	            return null; 
	        } 
	  
	        while (tail.next != null) { 
	            tail = tail.next; 
	        } 
	  
	        // Node to point to last of linked list 
	      Node<Integer> last = tail; 
	  
	     Node<Integer> current = head; 
	     Node<Integer> prev = null; 
	    // Node prev2 to point to previous when head.data!=key 
	     Node<Integer> prev2 = null; 
	  
	        // loop to perform operations to remove key to end 
	        while (current != tail) { 
	            if (current.data == key && prev2 == null) { 
	                prev = current; 
	                current = current.next; 
	                head = current; 
	                last.next = prev; 
	                last = last.next; 
	                last.next = null; 
	                prev = null; 
	            } 
	            else { 
	                if (current.data == key && prev2 != null) { 
	                    prev = current; 
	                    current = current.next; 
	                    prev2.next = current; 
	                    last.next = prev; 
	                    last = last.next; 
	                    last.next = null; 
	                } 
	                else if (current != tail) { 
	                    prev2 = current; 
	                    current = current.next; 
	                } 
	            } 
	        } 
	        return head;     
	     }
		
	public static Node<Integer> takeInput(){
		Node<Integer> head =null ,tail=null;
		Scanner s =new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1){
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null){
				head=newNode;
				tail=newNode;
			}
			else{
				tail.next=newNode;
				tail=newNode;
				// or tail=tail.next;
			}
			data=s.nextInt();
		}
	 
	return head;
	}
	public static void print(Node<Integer> head){
		 Node <Integer> temp=head;
			
			  while(temp!=null){
		    	  
		     	 System.out.print(temp.data+"->");
		     	 temp=temp.next;
			  }
		 
			System.out.println();
		}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		 Node<Integer>head=takeInput();
			int data =s.nextInt();
		 
 	 head= moveToLast(head , data) ;
		print(head);

	}

}
