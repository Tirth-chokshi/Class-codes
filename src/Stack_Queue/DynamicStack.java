package Stack_Queue;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()){
            int temp[] = new int[data.length +1];
            for (int i = 0; i < data.length; i++) {
                temp[i]= data[i];
            }
            data = temp;
        }
        // at this point we know that array is not full
        //hence we can insert item normally
        //inset item
        return super.push(item);
    }
}
