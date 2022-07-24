class Main {
    public static double solution(int[] arr) {
        double answer = 0;
        int total = 0;
        for(int i=0; i<arr.length; i++){
            total += arr[i];
        }
        answer = total/(double)arr.length;

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(new int[]{5,5}));
    }
}
