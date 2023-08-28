import java.util.Stack;

public class JavaStack{
        
       public static void main(String[] args){              
              //처음에는 아무 element도 없음  
              Stack<Integer> stack = new Stack<Integer>();

              //stack에 값 넣기
              stack.push(1);
              stack.push(2);

              //이 코드 뒤부터 작성하는 코드로는 처음에 넣은 데이터 1만 접근 할 수 있음
              stack.pop();
              int firstPushItem = stack.pop();
              
              //1 출력됨 
              System.out.println(firstPushItem);
               
       }

}  
  
