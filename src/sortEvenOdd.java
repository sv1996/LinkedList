import java.util.Scanner;

public class sortEvenOdd {
	public static Node<Integer> sortEvenOdd(Node<Integer>head){
		Node<Integer>oddHead=null;
		Node<Integer>oddTail=null;
		Node<Integer>evenHead=null;
		Node<Integer>evenTail=null;
		Node<Integer>current=head;
		while(current!=null){
			if(current.data%2==0){
				if(evenHead==null){
					
					evenHead=evenTail=current;
				}else{
					evenTail.next=current;
					evenTail=current;
				} // 1 block if else
			}
			else{
					if(oddHead==null){
						
						oddHead=oddTail=current;
					}
					else{
						oddTail.next=current;
						oddTail=current;
					} /// 2 block if else
				}
			current=current.next;
		}
		if(oddTail==null){
			return evenHead;
		}
			if(evenTail==null){
				return oddHead;
			}
			
			oddTail.next=evenHead;
			evenTail.next=null;
			return oddHead;
				
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
		head=sortEvenOdd(head);
		print(head);
		
	}

}
