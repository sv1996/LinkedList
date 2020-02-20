import java.util.Scanner;

public class PalindromeLinkedList {
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
	// reverse funtion to reverse second half of list
	private static Node<Integer> reverseLinkedList(Node<Integer> head){
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
	// check palindrome LinkedList
	public static boolean is_PalindromeLL(Node<Integer> head){
		 
		if(head==null && head.next==null){
			return true;
		}
		// for dividing linkedlist in two part
		Node<Integer> fast=head;
		Node<Integer> slow=head;
		while(fast.next!=null &&  fast.next.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			}
		Node<Integer> secondHead=slow.next;
	 	slow.next=null;
		secondHead=reverseLinkedList(secondHead);
		Node<Integer> p=secondHead;
		Node<Integer> q=head;
		while(p!=null){
			if(p.data!=q.data){
				return false;
			}
			
			p=p.next;
			q=q.next;
			
		}
		 
	return true;
	
	
	
	}
	
	
	
	public static void main(String[] args) {
		Node <Integer> head=takeInput();
		System.out.print(is_PalindromeLL(head));
	}

}
