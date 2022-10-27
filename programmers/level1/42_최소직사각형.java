class Main {
    public int main(int[][] sizes) {
        int answer = 0;
        int largeNum = 0;
        int smallNum = 0;

        for(int i =0; i < sizes.length; i++) {
            int maxNum = Math.max(sizes[i][0], sizes[i][1]);
            int minNum = Math.min(sizes[i][0], sizes[i][1]);
            largeNum = Math.max(largeNum, maxNum);
            smallNum = Math.max(smallNum, minNum);
        }
        answer = largeNum * smallNum;

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(method.main(sizes));
    }
}
