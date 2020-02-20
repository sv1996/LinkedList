import java.util.Scanner;

public class DeleteRecursiveNode {
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
	public static Node<Integer> deleteRecursive(Node<Integer>head , int pos){
		if(pos==0){
			head=head.next;
			return head;
		}
		
		head.next= deleteRecursive(head.next ,pos-1);
		return head;
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		 
		
		Node <Integer> head=takeInput();
		Scanner s =new Scanner (System.in);
		//int data=s.nextInt();
		int pos=s.nextInt();
		head=deleteRecursive(head ,pos);
		print(head);

	}

}
