import java.util.Scanner;

public class MiddleLinkedList 
{
	public static int printMiddleLL(Node<Integer> head){
		 
		Node<Integer> fast=head;
		Node<Integer> slow=head;
		if(head==null){
			return -1;
		}
		while(fast!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		 
	  
		  return slow.data;
		
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
	       int ans=	printMiddleLL(head);
           System.out.print(ans);
	}

}
