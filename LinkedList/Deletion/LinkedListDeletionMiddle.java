public class LinkedListDeletionMiddle {
    public static void main(String[] args){

        //노드 3개 가진 링크링스트 생성
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);

        //2번쨰 (중간노드) 삭제
        ll.head.next = ll.head.next.next;

        //삭제 후 존재하는 노드들을 데이터 출력
        Node currentNode = ll.head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }   
    
}
