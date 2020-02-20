import java.util.Scanner;
 
public class ReverseRecursiveLL {

	
	
	
	
	
	
	
	
	
	public static Node<Integer> reverseRecursiveLL(Node<Integer> head){
		// if list have 1 node
		if(head==null || head.next == null){
			return head;
			
		}
		// collect final head of n-1 list
		Node<Integer> finalHead= reverseRecursiveLL(head.next);
		Node<Integer> temp=finalHead;
		while(temp.next!=null){
			temp=temp.next; 
		}
//		2-->1
		temp.next=head;
		// 1-->null
		head.next=null;
		return finalHead;
		
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
		head=reverseRecursiveLL(head);
		print(head);
		
		
		
	}
}
