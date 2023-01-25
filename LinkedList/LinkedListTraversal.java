public class LinkedListTraversal {
    
    public static void main(String[] args){
        
        //2개 노드를 가진 링크리스트 생성
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);

        //링크리스트 데이터 출력
        Node currentNode;
        currentNode = list.head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        
    }

}
