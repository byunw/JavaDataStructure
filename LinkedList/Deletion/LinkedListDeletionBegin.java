public class LinkedListDeletionBegin {
    
    public static void main(String[] args){

        //2개 노드를 가진 링크리스트 생성
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);

        //첫번쨰 노드 삭제
        list.head = list.head.next;

        //삭제 후 남아 있는 노드의 데이터 출력
        Node currentNode = list.head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
            
    }
    
}
