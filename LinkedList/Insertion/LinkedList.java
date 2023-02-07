public class LinkedList{
      
       Node head;
  
       static class Node{      
              int data;
              Node next;
              Node(int d){
                   data = d;
              }
       }  
       
      public static void main(String[] args){
       
             LinkedList list = new LinkedList();
             Node currentNode = list.head;
             Node newNode;
             Node tail = null;
             for(int i=1;i<=150000000;++i){

                 //첫번쨰 노드 추가 
                 if(i==1){
                    newNode = new Node(1);
                    list.head = newNode;
                    currentNode = list.head;
                 }

                 //첫번쨰 노드 아닌 경우 
                 else{
                      newNode = new Node(1);
                      currentNode.next = newNode;
                      currentNode = newNode;   
                      //마지막 노드인 150000000번째 노드 tail이 가리킴    
                      if(i==150000000){
                         tail = currentNode;
                      }   
                 }

            }

            //새로운 노드 생성하고 마지막 노드로 붙여주기
            newNode = new Node(1);
            tail.next = newNode;
      
     }
  
  
}  
