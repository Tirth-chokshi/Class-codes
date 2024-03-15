class scLinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node (int d){
			data=d;
			next=null;
		}
	}
	public static void main(String args[]){
		scLinkedList sc=new scLinkedList();
		sc.iFront(10);
		sc.iFront(5);
		sc.iEnd(30);
		sc.iMiddle(20,2);
		sc.display();
		sc.dFront();
		sc.dEnd();
		sc.dMiddle(2);
		sc.display();
	}
	void display(){
		if(head==null){
			System.out.print("list is empty");
		}else{
			Node temp=head;
			while(temp.next!=head){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		System.out.print(temp.data);
		}
	}
	void iFront(int data){
		Node nd=new Node(data);
		if(head==null){
			head=nd;
			nd.next=head;
		}else{
			Node temp=head;
			while(temp.next!=head)
			{temp=temp.next; }
				temp.next=nd;
				nd.next=head;
				head=nd;
		}
	}
	void iEnd(int data){
		Node nd=new Node(data);
		Node temp=head;
		while(temp.next!=head){
			temp=temp.next;
		}
		nd.next=temp.next;
		temp.next=nd;
		temp=nd;
	}
	void iMiddle(int data,int pos){
		int i;
		Node nd=new Node(data);
		Node temp=head;
		for(i=0;i<(pos-1);i++){
			temp=temp.next;
		}
		nd.next=temp.next;
		temp.next=nd;
	}
	void  dFront(){
		Node temp=head;
		Node tail=head;
		while(tail.next!=head){
			tail=tail.next;
		}
		temp=temp.next;
		head=temp;
		tail.next=head;
	}
	void dEnd(){
		Node temp=head;
		Node temp1=temp.next;
		while(temp1.next!=head){
			temp=temp1;
			temp1=temp1.next;
		}
		
		temp.next=head;
		temp1=null;
	}
	void  dMiddle(int pos){
		Node temp=head;
		Node temp1=temp.next;
		for(int i=1;i<(pos-1);i++){
			temp=temp.next;
		}
		temp.next=temp1.next;
		temp1=null;
	}
}