import java.util.Scanner;

public class PairWiseSwap {
	public static Node<Integer> pairWiseSwap(Node<Integer> head){
		Node<Integer> temp=head;
		while(temp!=null && temp.next !=null){
			
			int k=temp.data;
			temp.data=temp.next.data;
			temp.next.data=k;
			temp=temp.next.next;
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
		 Node<Integer>head=takeInput();
		head= pairWiseSwap(head);
		print(head);

	}

}
