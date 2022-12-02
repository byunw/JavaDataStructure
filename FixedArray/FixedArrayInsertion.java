public class FixedArrayInsertion{
    
    public static void main(String[] args){
         
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        
        //더 큰 크기의 배열 생성 
        int[] numbers2 = new int[4];
     
        //기존 배열에 있던 값 더 큰기의 배열로 복사  
        for(int i=0;i<4;++i){
            if(i<=2){
                numbers2[i] = numbers[i];
            }
        }

        //더 큰 크기의 배열에 추가적인 데이터 삽입
        numbers2[3] = 4;
                         
    }
     
}
