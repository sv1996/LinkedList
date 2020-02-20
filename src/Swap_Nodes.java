import java.util.Scanner;

public class Swap_Nodes {
public static Node<Integer> swapNodes(Node<Integer> head,int i,int j){
	// nothing to do if x and y are same
	if(i==0 || j==0){
		return head;
	}
	
	 int cx=0,cy=0;
	 //search for x keep track of preX and currX
	 Node<Integer> prevX=null;
	 Node<Integer> currX=head;
	   
	        while (currX != null && cx!=i)
	        {
	            prevX = currX;
	            currX = currX.next;
	              cx++;
	        }
	 
	        // Search for y (keep track of prevY and currY)
	  Node<Integer> prevY = null;
	   Node<Integer> currY = head;
	  while (currY != null && cy != j)
      {
          prevY = currY;
          currY = currY.next;
        cy++;
      }

      // If either x or y is not present, nothing to do
      if (currX == null || currY == null)
          return head;

      // If x is not head of linked list
      if (prevX != null)
          prevX.next = currY;
      else //make y the new head
          head = currY;

      // If y is not head of linked list
      if (prevY != null){
          prevY.next = currX;
      }
      else{
         // make x the new head
          head = currX;}

	
 // swap two pointers
	 Node<Integer> temp = currX.next;
     currX.next = currY.next;
     currY.next = temp;
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
		 Scanner s=new Scanner(System.in);
		 int i=s.nextInt();
		 int j=s.nextInt();
		 head=swapNodes(head,i,j);
		 print(head);

	}

}
