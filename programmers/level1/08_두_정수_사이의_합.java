class Main {
    public static long solution(long a, long b) {
        long answer = 0;
        long start = 0;
        long end = 0;

        if (a <= b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }

        for (long i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(3,5));
    }
}
