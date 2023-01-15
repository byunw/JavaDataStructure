public class ArrayValueSearching{
       public static void main(String[] args){
              
               //10000개 element 가지는 배열 생성
              int[] numbers = new int[10000];
              
              //10000개의 element에 3을 저장
              for(int i=0;i<10000;++i){
                  numbers[i] = 3;
              }
            
              //어레이에서 값 서치(10000개의 element에 다 3이 저장되어있어서 "found!"가 10000번 찍힘)
               for(int i=0;i<10000;++i){
                  if(numbers[i]==3){
                     System.out.println("found!");
                  }
              }
         
      } 
}
