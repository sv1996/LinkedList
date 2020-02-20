import java.util.Scanner;
 /*Input Format :
Elements of the linked list ending with -1 (-1 not included)
Output Format:
Decimal equivalent of input LL
Constraints :
1 <= size of list <= 100
Sample Input 1:
1 0 -1
Sample Output 1:
2
*/
public class DecimalEquivalent {
	public static int decimalEquivalent(Node<Integer> head)
	{
		int res=0;
		while(head!=null){
		 
			while(head!=null){
				     res = (res *2) + head.data;

	        // Move next
	        head = head.next;
			}
			return res;
	        
			
		}
		return res;
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
		int ans=decimalEquivalent(head);
	 System.out.print(ans);
	}

}
