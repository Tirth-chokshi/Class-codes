class dLinkedList1{
	Node head=null;
	class Node{
		int data;
		Node next,prev;
		Node(int d){
			data=d;
			next=null;
			prev=null;
		}
	}
	public static void main(String ar[]){
		dLinkedList1 d=new dLinkedList1();
		d.iFront(10);
		d.iFront(5);
		d.iEnd(30);
		d.iMiddle(20,2);
		d.display();
		d.dFront();
		d.dEnd();
		d.dMiddle(2);
		d.display();
	}
	 void display(){
	 	Node temp=head;
		if(head==null){
			System.out.print("List is empty");
		}
		else{
			while(temp.next!=null){
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
		}
		else{
			nd.next=head;
			head.prev=nd;
			head=nd;
		}
	}
	void iEnd(int data){
		Node nd=new Node(data);
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=nd;
		nd.prev=temp;
	}
	void iMiddle(int data,int pos){
		Node nd=new Node(data);
		Node temp=head;
		if(pos<1){
			System.out.print("Should Enter position >=1.");
		}
		else{
			for(int i=1;i<(pos-1);i++){
				temp=temp.next;
			}
			nd.next=temp.next;
			nd.prev=temp;
			temp.next=nd;
			temp=nd;
		}
	}
	void dFront(){
		Node temp=head;
		head=temp.next;
		head.prev=null;
		temp=null;
	}
	void dEnd(){
		Node temp=head;
		Node temp1=null;
		while(temp.next!=null){
			temp1=temp;
			temp=temp.next;
		}
		temp=null;
		temp1.next=null;
	}
	void dMiddle(int pos){
		Node temp=head;
		Node temp1=temp.next;
		if(pos<1){
			System.out.print("Position should be >=1.");
		}
		else{
			for(int i=1;i<(pos-1);i++){
				temp=temp1;
				temp1=temp1.next;
			}
			temp.next=temp1.next;
			temp1=null;
		}
	}
}