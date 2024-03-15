class queue1{
	int  f=-1,r=-1;
	int n=10;
	int item[]=new int[n];
	void enqueue(int element)
	{
		if(r==(n-1))
			System.out.println("Overflow Queue");
		else{
			if(f==-1&&r==-1){
				f=0;
				r=0;
				item[r]=element;
			}
			else{
				r=r+1;
				item[r]=element;
			}
		}
	}
	void dequeue()
	{
		if(f==-1 && r==-1)
			System.out.print("Underflow");
		else{
			System.out.println("Dleted: "+item[f]);
			f=f+1;
		}
	}
	void display(){
		System.out.println("items are: ");
		for(int i=f;i<=r;i++)
		{
			System.out.println(item[i]+" ");
		}

	}
	public static  void main(String args[]){
		queue1 q=new queue1();
			
	
    for(int i = 1; i < 6; i ++) {
      q.enqueue(i);
    }

   
   //q.enqueue(6);

    q.display();

    q.dequeue();

    q.display();

   // q.dequeue();

   // q.display();

	}

}