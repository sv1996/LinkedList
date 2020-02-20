import java.util.Scanner;

public class LengthOfLLRecursive {
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
	public static int LengthRecursive(Node<Integer> head){
		// base case
		if(head==null){
			return 0;
		}
	 
	return 1+LengthRecursive( head.next);
		
		
		
		
		
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
		Node <Integer> head=takeInput();
		System.out.print(LengthRecursive(head));
	}

}
