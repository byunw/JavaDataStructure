public class LinkedListSearch {
     
    public static void main(String[] args){
          
        //노드 3개 가진 링크링스트 생성
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        
        //찾고자 하는 값  
        int value = 3;
        
        //첫번쨰 노드 가리키게 하기
        Node currentNode = ll.head;
        
        boolean found = false;
        
          
        while(currentNode!=null){
            
            //갑 찾음
            if(currentNode.data==value){
                System.out.println("값 찾음!");
                found = true;
                break;
            }
            //다음 노드 가리키기
            currentNode = currentNode.next; 

        }
        
        //값 못 찾음
        if(!found){
           System.out.println("값 못 찾음.");
        }
        
    }
    
}
