public class FixedSizeArrayDeletion {
    public static void main(String[] args){
        
        //사이즈 3 크기의 배열 생성
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
          
        //작은 사이즈 어레이 생성
        int[] numbers2 = new int[2];
        
        //제거할 값 빼고 나머지 값들 새로 생성된 작은 배열에 복사
         //비 효율적인 방법이긴 함
        for(int i=0;i<2;++i){
            numbers2[i] = numbers[i];
        }
        
    }
}
