class Main {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int rowNum = arr1.length;
        int columnNum = arr1[0].length;
        int[][] answer = new int[rowNum][columnNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                answer[i][j] = arr1[i][j]+arr2[i][j];
//                System.out.println(answer[i][j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}));
    }
}
