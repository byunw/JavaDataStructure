public class LinkedListInsertionEnd {
    
    public static void main(String[] args){
          
        //2개 노드를 가진 링크리스트 생성
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);

        //노드 한개 만들어주고 기존 마지막 노드가 가리키게 하면됨
        list.head.next.next = new Node(3);

        //새로운 추가된 노드 포함하여 노드를 값 출략
        Node currentNode;
        currentNode = list.head;
        while(currentNode!=null){
             System.out.println(currentNode.data);
             currentNode = currentNode.next;
        }

    }
    
}
