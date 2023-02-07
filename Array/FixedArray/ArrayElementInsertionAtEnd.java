public class ArrayElementInsertionAtEnd{
    
    public static void main(String[] args){
        
        //150000000 요소에 1 저장
        int[] numbers = new int[150000000];
        for(int i=0;i<150000000;++i){
            numbers[i] = 1;
        }
        
        //150000001 요소 가진 배열에 배열 numbers 값들 복사 
        int[] numbers2 = new int[150000001];
        for(int i=0;i<150000000;++i){
            numbers2[i] = numbers[i];
        }
        
        //추가된 요소에 새로운 값 2 저장
        numbers2[150000000] = 2;
        
    }
    
}   
