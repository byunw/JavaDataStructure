public class ArrayDeletionAtIndex {
        public static void main(String[] args){

        //배열 생성하고 값 초기화
        int[] numbers;
        numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 12;
        numbers[2] = 3;
        numbers[3] = 4;

        int targetIndex = 2;

        //사이즈 1 더 작은 배열 생성
        int[] numbers2;
        numbers2 = new int[3];

        //targetIndex 앞에 오는 지역에 있는 값은 그대로 옮기기
        for(int i=0;i<targetIndex;++i){
            numbers2[i] = numbers[i];
        }
        
        //targetIndex 다음에 오는 지역은 1칸씩 땡겨서 새로운 배열에 저장
        for(int i=targetIndex+1;i<4;++i){
            numbers2[i-1] = numbers[i];
        }
        
        //기존 배열의 특정한 index 값을 뺀 값을 가진 새로운 배열의 값들 출력
        for(int i=0;i<3;++i){
            System.out.println(numbers2[i]);
        }

    }
}
