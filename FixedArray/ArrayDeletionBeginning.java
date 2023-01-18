public class ArrayDeletionBeginning {
    
    public static void main(String[] args){

        //배열 생성하고 초기화
        int[] numbers = {1,2,3,4};
        
        //사이즈 1 더 작은 크기의 배열 생성
        int[] numbers2 = new int[3];

        //첫번째 요소의 값 제외하고 새로ㄴ운 배열로 복사
        for(int i=1;i<4;++i){
            numbers2[i-1] = numbers[i];
        }
        
        //기존 배열의 첫번쨰 값 뺸 값을 가지는 새로운 배열값들(2,3,4) 순차적으로 출력
        for(int i=0;i<3;++i){
            System.out.println(numbers2[i]);
        }

    }

}
