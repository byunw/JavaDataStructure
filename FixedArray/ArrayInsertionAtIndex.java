public class ArrayInsertionAtIndex {
    public static void main(String[] args){
        
        //배열 생성하고 값 초기화
        int[] numbers;
        numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        //사이즈 1 더 큰 배열 생성
        int[] numbers2;
        numbers2 = new int[4];

        //원하는 위치 전에 있는곳의 값 index 유지하며 새로운 배열에 저장
        int targetIndex = 1;
        for(int i=0;i<targetIndex;++i){
            numbers2[i] = numbers[i];
        }
        
        //새로운 배열에 원하는 위치에 새 값 저장
        numbers2[targetIndex] = 4;

        //insert하는곳부터(index 1) 한 칸씩 밀려서 저장
        for(int i = targetIndex;i<3;++i){
            numbers2[i+1] = numbers[i];  
        }   

        //새로운 값 추가된 배열 값들(1,4,2,3) 순차적으로 출력
        for(int i=0;i<4;++i){
            System.out.println(numbers2[i]);
        }   
        

    }
    
}
