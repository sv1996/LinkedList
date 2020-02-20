import java.util.Scanner;

public class DeleteEveryNnode {
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
	 
		Node<Integer>  t=head;
		Node<Integer>  current=head;
			      int count;
			 
			 while(current != null){
				 // skip m nodes
				 for(count=1;count<M && current !=null;count++){//////////////------------------------------
					 current=current.next;
				 }
				 // if we reach end of list
				 if(current== null){
				 return head;//////---------------------------------------------
				 }
				 t=current.next;
				 // we start from t then  delete N nodes 
				 for( count=1;count<=N && t!=null ; count++){
			 	 
					 t=t.next;
				 }
				 current.next=t;
				 current=t;
			 }
			return head;////////---------------------------------------------
	        
		
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
		Node<Integer>head=takeInput();
		Scanner s =new Scanner(System.in);
 	int M=s.nextInt();
	 	int N=s.nextInt();
	 head=skipMdeleteN(head,  M,  N);
	         print(head);
	
	
	}

}
