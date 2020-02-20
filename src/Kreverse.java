import java.util.*;
public class Kreverse {
 
	public static Node<Integer> kthReverse(Node<Integer> head , int k){
	Node<Integer>current=head;
	Node<Integer> prev=null;
	Node<Integer>forw=null;
		int count=0;
		while(current!=null && count<k){
			forw=current.next;
			current.next=prev;
			prev=current;
			current=forw;
			count++;
			}
		if(forw!=null){
			head.next= kthReverse(forw ,k);
		}
		
	return prev;
	}
	public static Node<Integer> takeInput(){
		Node<Integer> head=null, tail=null;
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
	Node<Integer> head=takeInput();
 
	 
	Scanner  s=new Scanner(System.in);
	int k=s.nextInt();
	head= kthReverse(head,k);
	print(head);
		
	}

}
