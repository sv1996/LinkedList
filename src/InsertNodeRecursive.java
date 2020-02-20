import java.util.Scanner;

public class InsertNodeRecursive {
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
	public static Node<Integer> insertNodeRecursive(Node<Integer> head, int data, int pos){
		if(pos==0){
			Node<Integer> newNode=new Node<Integer> (data);
			newNode.next=head;
			return newNode;
		}
		if(head==null){
			return head;
		}
	head.next=insertNodeRecursive(head.next,data,pos-1);
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
		head=insertNodeRecursive( head,data,pos);
		print(head);

	}

}
