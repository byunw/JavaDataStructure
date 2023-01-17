public class ArrayAccessMeasure {
    public static void main(String[] args){
        
        //어레이 생성하고 초기화 
        int[] numbers = new int[1000000000];
        for(int i=0;i<1000000000;++i){
            numbers[i] = 10;
        }
        
        long beforeTime = System.currentTimeMillis();
        
        //다음 코드 실행시간 대락 1ms 걸림
        System.out.println(numbers[999999999]);
        
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime-beforeTime);  
        System.out.println("시간차이 : "+secDiffTime);
        
    }  
}
