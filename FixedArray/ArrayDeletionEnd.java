public class ArrayDeletionEnd {
    public static void main(String[] args){
        
        //배열 생성 값 초기화
        int[] numbers = {1,2,3,4};

        //사이즈 1 작은 어레이 배열 
        int[] numbers2;
        numbers2 = new int[3];

        //사이즈 1 작은 배열에 기존 배열의 마지막 값 제외하고 복사
        for(int i=0;i<3;++i){
            numbers2[i] = numbers[i];
        }
        
        //마지막 값 제외한 값들을 가지고 있는 배열 값들 출력: 1,2,3 순차적으로 출력됨
        for(int i=0;i<3;++i){
            System.out.println(numbers2[i]);
        }

    }
}
