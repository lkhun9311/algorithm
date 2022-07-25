import java.util.*;

class Main {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        int addResult = 0;
        int index = 0;

        List<Integer> arr = new ArrayList<>();

        for(int i =0; i<numbers.length-1; i++){
            for(int j=i+1;j<numbers.length;j++){
                addResult = numbers[i]+numbers[j];
                if(!arr.contains(addResult)){
                    arr.add(addResult);
                }
            }
        }
        
        answer = new int[arr.size()];
        for(int element : arr){
            answer[index++] = element;
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(Arrays.toString(method.solution(new int[]{2, 1, 3, 4, 1})));
    }
}
