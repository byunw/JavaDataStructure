public class ArrayInsertionBeginning {
    public static void main(String[] args){
        
        //배열 생성하고 초기화
        int[] numbers;
        numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        //사이즈 1 더 큰 배열 생성
        int[] numbers2;
        numbers2 = new int[4];

        //기존 배열값들 1 칸씩 밀려서 저장
        for(int i=0;i<3;++i){
            numbers2[i+1] = numbers[i];
        }

        //새로 생성된 배열의 첫번째 요소에 값 저장  
        numbers2[0] = 0;
        
        //새로 생성된 배열의 값들(0,1,2,3) 순차적으로 출력
        for(int i=0;i<4;++i){
            System.out.println(numbers2[i]);
        }

    }
    
}
