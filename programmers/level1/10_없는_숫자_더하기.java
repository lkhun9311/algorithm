class Main {
    public static int solution(int[] numbers) {
        int answer = 45;

        for (int number : numbers) {
            answer -= number;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }
}
