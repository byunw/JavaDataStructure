import java.util.ArrayList;

//ArrayList는 실제 데이터를 가진 객체들을 가리키는 참조변수들은 heap 메모리에 contiguous
//하지만 실제 데이터를 가진 객체들은 heap 메모리에 인접하지 않음

public static void main(String[] args){
       public static void main(String[] args){
              //ArrayList 생성
              ArrayList<Integer> integers = new ArrayList<>(2);
              
              //ArrayList값 추가 
              integers.add(1);
              integers.add(2);
      
              //capacity 2로 했지만 메모리 더 사용 가능
              integers.add(3);    
       }
}


    
