import java.util.Scanner;

public class DeleteIthNode {
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
	public static Node<Integer> deleteIthNode(Node<Integer>head, int pos){
		if(head==null){
			return head;
		}
      if(pos==0){
		 return head.next;
	}
	Node<Integer> temp=head;
	int i=0;
	while(temp!=null  && i<pos-1){
		temp=temp.next;
		i++;
	}
	if(temp==null){
		return head;
	}
	if(temp.next!=null){
		temp.next=temp.next.next;
		 
	}
	return head;
}
	public static void main(String[] args) {
		Node <Integer> head=takeInput();
		Scanner s =new Scanner(System.in);
		int pos=s.nextInt();
		head= deleteIthNode(head,pos);
		print(head);
		
	}

}
