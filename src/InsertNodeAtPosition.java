import java.util.Scanner;

public class InsertNodeAtPosition {
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
public static  Node<Integer> insert(Node<Integer> head, int data, int pos){
		
		Node<Integer> newNode=new Node<Integer> (data);
		// for 0th position
		if(pos==0){
			newNode.next=head;
			 
			return newNode;
		}
		// another position other than 0th position
		int i=0;
		Node<Integer> temp=head;
		while( i<pos-1){
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
		
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
		Node <Integer> head=takeInput();
		Scanner s =new Scanner (System.in);
		int data=s.nextInt();
		int pos=s.nextInt();
		head= insert(head,  data,  pos);
		 print(head);

	}

}
