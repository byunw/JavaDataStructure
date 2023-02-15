class Queue {

    int maxSize;
    int front;
    int arr[];
    int elementCount;
    int loc;

    public Queue(int n){
        maxSize = n;
        arr = new int[maxSize];
        front = 0;
    }

    public void push(int value){
        arr[loc++] = value;
        ++elementCount;
    }

    public int pop(){
        if(elementCount==0){
            System.out.println("삽입된 값이 존재하지 않습니다!");
            System.exit(0);
        }
        --elementCount;
        return arr[front++];
    }

    public int peek(){
        if(elementCount==0){
            System.out.println("삽입된 값이 존재하지 않습니다!");
            System.exit(0);
        }
        return arr[front];
    }

    public Boolean empty(){
        return (elementCount==0);
    }

    public boolean isFull(){
        return (maxSize == elementCount);
    }

    public int size(){
        return elementCount;
    }

}
