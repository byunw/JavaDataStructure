public class LinkedList{
    
    Node head;
    
    //inner class
    static class Node{
        
        int data;
        Node next;
        
        //생성자
        Node(int d){
            data = d;
        }
        
    }
    
    public static void main(String[] args){
      
        //LinkedList 객체 생성   
        LinkedList list = new LinkedList();
        
        //4개노드 가진 LinkedList 구현
        list.head = new Node(1);
        Node second = new Node(2);
        list.head.next = second;
        Node third = new Node(3);
        list.head.next.next = third;
        Node fourth = new Node(4);
        list.head.next.next.next = fourth;
        
        //currentNode가 첫번쨰 노드 가리키게 함
        Node currentNode = list.head;
           
        //링크 리스트 노드 값들 출력
        while(currentNode!=null){
             System.out.println(currentNode.data);
             currentNode = currentNode.next;   
        }
        
    }

}
