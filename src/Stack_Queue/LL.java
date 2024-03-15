class sLinkedList{
		Node head=null;
		class Node{
			int data;
			Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
		public static void main(String ar[]){
			sLinkedList s=new sLinkedList();
			s.iFront(10);
			s.iFront(5);
			s.iEnd(30);
			s.iMiddle(20,3);
			s.display();
			s.dFront();
			s.dEnd();
			s.dMiddle(2);
			s.display();
		}
		void display(){
			if(head==null){
				System.out.print("List is empty");
				}
			else{
				Node temp=head;
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
			temp=nd;
		}
		void iMiddle(int data,int pos){
			Node nd=new Node(data);
			if(pos<1){
				System.out.print("position should be >=1");
			}
			else{
				Node temp=head;
				for(int i=1;i<(pos-1);i++){
					temp=temp.next;
				}
				nd.next=temp.next;
				temp.next=nd;
			}
		}
		void dFront(){
			Node temp=head;
			head=head.next;
			temp=null;
		}
		void  dEnd(){
			Node temp=head;
			Node ptr = temp.next;
			while(ptr.next!=null){
				temp = ptr;
				ptr = ptr.next;
			}
			temp.next = null;
			ptr = null;
		}
		void dMiddle(int pos){
			if(pos<1){
				System.out.print("The postion should be >=1");
			}
			else{
				Node temp=head;
				Node temp1=temp.next;a
				for(int i=1;i<(pos-1);i++){
					temp=temp1;
					temp1=temp1.next;
				}
				temp.next=temp1.next;
				temp1=null;
			}
		}
	} 