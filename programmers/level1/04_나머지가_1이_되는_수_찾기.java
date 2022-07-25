import java.util.*;

class Main {
    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if(n%i==1){
                arr.add(i);
            }
        }
        answer = arr.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(12));
    }
}
