 
import java.util.Scanner;
public class LinkedListUse {
	
	public static Node<Integer> takeInput(){
		Node<Integer> head =null;
		
		Scanner s =new Scanner(System.in);
		int data=s.nextInt();
		while(data !=-1){
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null){
				head=newNode;
			}
			else{
				Node <Integer> temp=head;
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=newNode;
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
	 
	
}
	public static void main(String[] args) {
 
		Node <Integer> head=takeInput();
		 print(head);
       
    System.out.print("hello world how are you");     
          
         
         
         
	}

}
