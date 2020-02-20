import java.util.Scanner;



class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;

}
public class ReverseLinledListBetter {
	// reverse function most efficient
	public static Node<Integer> reverseRecursiveEfficient(Node<Integer> head){
		// if list have 1 node
			if(head==null || head.next == null){
				return head;
				
			}
			Node<Integer> reverseTail=head.next;
			
			// collect final head of n-1 list
			Node<Integer> smallHead= reverseRecursiveEfficient(head.next);
			reverseTail.next= head;
			 
			return head;
			
		}
		
	
	
	
	
	
	// reverse function 1
	public static DoubleNode reverseLinkedListBetter(Node<Integer> head){
		if(head==null  || head.next ==null){
			 DoubleNode ans = new DoubleNode();
			 ans.head=head;
			 ans.tail=head;
			 return ans;
		}
		 DoubleNode smallAns=reverseLinkedListBetter(head.next);
		 smallAns.tail.next= head;
		 head.next=null;
		
		 DoubleNode ans= new DoubleNode();
		ans.head= smallAns.head;
		ans.tail=head;
		return ans;
		
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
		 Node<Integer> head= takeInput();
		 DoubleNode ans =reverseLinkedListBetter(head);
		 print(ans.head);
		
		
		
	}

}
