import java.util.*;

class Main {
    public long[] main(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i<n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(Arrays.toString(method.main(2, 5)));
    }
}
