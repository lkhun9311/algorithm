class Main {
    public static int solution(int[] nums) {
        int answer = 0;
        boolean check = false;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (logicCheck(nums[i], nums[j], nums[k]) == true) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static boolean logicCheck(int a, int b, int c) {
        int total = a + b + c;

        for (int i = 2; i < total; i++) {
            if (total % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(new int[]{1, 2, 7, 6, 4}));
    }
}
