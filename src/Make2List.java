import java.util.Scanner;

public class Make2List {
	
	public static void make2List(Node<Integer> head){
	 Node<Integer> temp=head;
	 Node<Integer> a1=null;
	 Node<Integer> a2=null;
	 Node<Integer> a1Head=null;
	 Node<Integer> a2Head=null;
		int i=1;
		while(temp!=null)
		{
     if(i%2==0){
				if(a2==null){
					a2=temp;
					a2Head=temp;
				}else{
					a2.next=temp;
					a2=a2.next;
				}
        }
	else{
					if(a1==null){
						a1=temp;
						a1Head=temp;
					}
					else{
						a1.next=temp;
						a1=a1.next;	
	                    }
				
				
     }
     temp=temp.next;
     i++;
	}
		a1.next=null;
		a2.next=null;
		a1Head=reverse_I(a1Head);
		a2Head=reverse_I(a2Head);
		while(a1Head!=null){
			System.out.print(a1Head.data+" ");
			a1Head=a1Head.next;
		}
		System.out.println();
		while(a2Head!=null){
			System.out.print(a2Head.data+" ");
			a1Head=a2Head.next;
		}
		
		
		}
	
	
	
	public static Node<Integer> reverse_I(Node<Integer> head){
		Node<Integer> current=head;
		Node<Integer> prev=null;
		Node<Integer> forward=null;
		while(current!=null){
			forward=current.next;
			current.next=prev;
			prev=current;
			current=forward;
			
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
		Node<Integer>head=takeInput();
		make2List(head);
		
		
		
		
		

	}

}
