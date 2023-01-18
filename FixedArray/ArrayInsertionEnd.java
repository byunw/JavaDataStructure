public class ArrayInsertionEnd {
    
    public static void main(String[] args){

        //배열 초기화 
        int[] sequence;
        sequence = new int[3];
        sequence[0] = 1;
        sequence[1] = 2;
        sequence[2] = 3;
        
        //사이즈 1큰 배열 생성
        int[] sequence2;
        sequence2 = new int[4];

        //기존 배열값 복사
        for(int i=0;i<3;++i){
            sequence2[i] = sequence[i];
        }
        
        //새로 생성한 배열에 마지막 element에 4저장
        sequence2[3] = 4;

        //새로 생성한 배열에 값 출력
        for(int i=0;i<4;++i){
            System.out.println(sequence2[i]);
        }

    } 
    
}
