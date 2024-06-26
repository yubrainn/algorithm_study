package Week3.공통.뒤에있는큰수찾기;
import java.util.*;
public class taehwan {

    class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            Stack<Integer> s = new Stack<>();

            for(int i=numbers.length-1; i>=0; i--){
                while(!s.isEmpty()){
                    if(s.peek() > numbers[i]){
                        answer[i] = s.peek();
                        break;
                    }else{
                        s.pop();
                    }
                }
                if(s.isEmpty()){
                    answer[i] = -1;
                }
                s.push(numbers[i]);
            }
            return answer;

        }
    }
}
