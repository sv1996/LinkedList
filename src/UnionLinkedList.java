import java.util.Scanner;

public class UnionLinkedList {
	public static Node<Integer > PushNode(int new_data , Node<Integer>head){
		 
        Node<Integer> new_node = new Node<>(new_data);
 
        
        new_node.next = head;
 
        
        head = new_node;
        return head;
	}
   public static  boolean isPresent (Node<Integer> head, int data)
    {
        Node<Integer> t = head;
        while (t != null)
        {
            if (t.data == data)
                return true;
            t = t.next;
        }
        return false;
    }
	
	public static Node<Integer> unionLinkedList(Node<Integer> head1, Node<Integer>head2){
	  Node<Integer> t1=head1;
	  Node<Integer> t2=head2;
		 
		while(t1!=null){
			 
			 PushNode(t1.data,head1);
	            t1 = t1.next;
			
			
		}
	
		 while (t2 != null)
	        {
	            if (!isPresent(head1, t2.data))
	                PushNode( t2.data ,head1);
	            t2 = t2.next;
	        }
		 return t2;
		
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
		Node<Integer>head1=takeInput();
		Node<Integer>head2=takeInput();
		 Node<Integer> newhead=unionLinkedList(head1,head2);
		 print(newhead);
	}

}
