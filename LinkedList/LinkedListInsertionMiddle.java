public class LinkedListInsertionMiddle {
    public static void main(String[] args){

        //2개 노드를 가진 링크리스트 생성
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);

        //1번째 노드와 2번째 노드 사이에 노드 삽입 
        Node temp = list.head.next;
        list.head.next = new Node(3);
        list.head.next.next = temp;

        //3개 노드의 값 출력 
        Node currentNode = list.head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }
    
}
