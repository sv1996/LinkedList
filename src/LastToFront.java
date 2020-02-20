import java.util.Scanner;

public class LastToFront {
	public static Node<Integer>lastToFront(Node<Integer> head){
		 
		Node<Integer> secondlast=null;
		Node<Integer> last=head;
	 
		if(head==null){
			return head;
		}
	 while(last.next!=null){    
		 
		 
		 secondlast=last;
		 last=last.next;
	 }
	 secondlast.next=null;
	 last.next=head;
       head=last;
       return head;
		
}
    public static Node<Integer> lastToFront1(Node<Integer> head){
	Node<Integer> current=head;
	Node<Integer> tail=null;
	if(head==null){
		return head;
	}
     while(current.next!=null){
	 tail=current;
	 current=current.next;
	 }
 
	tail.next=null; // for make last node pointing to null i.e. last Node
	current.next=head;  // make towards first Node;
	head=current;//  make last to head;
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
		head=lastToFront(head);
		print(head);
		 
	}

}
