import java.util.Scanner;

public class ReverseLinkedList {
	// for reversing linkedlist
	public static Node<Integer> reverseLinkedList(Node<Integer>head){
		Node<Integer> current=head;
		Node<Integer> prev=null;
		Node<Integer> forw=null;
		
		while(current != null){
			
			forw=current.next;
			current.next=prev;
			prev=current;
			current=forw;
		}
		return prev;
		
		
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
		 Node<Integer>head=takeInput();
		 head= reverseLinkedList(head) ;
		 print(head);
		 
	 

	}

}
