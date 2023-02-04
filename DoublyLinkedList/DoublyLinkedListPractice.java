class DoublyLinkedList {

    class Node{

        int item;
        Node previous;
        Node next;

        public Node(int item){
            this.item = item;
        }

    }

    Node head,tail = null;

    public void addNode(int item){

        Node newNode = new Node(item);

        if(head==null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }

        //요소가 있는 경우
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }

    }

}

class DoublyLinkedListPractice{
    public static void main(String[] args){
      
        //2개의 노드를 가진 더블링 링크 리스트 생성
        DoublyLinkedList dll = new DoublyLinkedList();    
        dll.addNode(1);
        dll.addNode(2);
      
        int valueOfFirstNode = dll.head.item;
        int valueOfSecondNode = dll.tail.item;

    }

}
