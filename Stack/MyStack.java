class MyStack{

    int maxSize;
    int top;
    int arr[];

    public MyStack(int n){
        maxSize = n;
        arr = new int[maxSize];
        top = 0;
    }

    public void push(int value){
        arr[top] = value;
        top++;
    }

    public int pop(){
        if(top==0){
            System.out.println("삽입된 값이 존재하지 않음");
            System.exit(0);
        }
        return arr[--top];
    }

    public Boolean empty(){
        if(top==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        return maxSize==top;
    }

    public int size(){
        return top;
    }

}
