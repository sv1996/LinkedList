import java.util.Scanner;

public class PrintIthNode {
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
	public static void printIth(Node<Integer> head, int i){
      Node <Integer> temp=head;
 
        int count=0;
         if(head==null){
             return ;
         }
        
        while( temp!=null   &&   count<i ){
            temp=temp.next;
            count++;
        }
         if(temp!=null){
             
             
             System.out.print(temp.data);
         }
		
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
		Node <Integer> head=takeInput();
		printIth(head,0);
	}

}
