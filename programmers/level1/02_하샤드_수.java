import java.util.*;

class Main {
    public static boolean solution(int x) {
        boolean answer = true;

        int digitTotal = 0;
        String[] arr = String.valueOf(x).split("");

        for (int i = 0; i < arr.length; i++) {
            digitTotal += Integer.parseInt(arr[i]);
        }

        if(x%digitTotal != 0){
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(12));
    }
}
