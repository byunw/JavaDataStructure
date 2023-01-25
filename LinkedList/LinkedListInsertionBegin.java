public class LinkedListInsertionBegin {
    
    public static void main(String[] args){

        //2개 노드를 가진 링크리스트 생성
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);

        //기존 첫번쨰 노드앞에 새로운 노드 삽입
        Node temp = list.head;
        list.head = new Node(0);    
        list.head.next = temp;

        Node currentNode = list.head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    
        System.out.println("새로 삽입된 노드의 데이터까지 다 출력!");
        
    }   
    
}
