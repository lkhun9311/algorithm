import java.util.*;

class Main {
    public int[] main(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arr);

            int index = commands[i][2] - 1;
            answer[i] = arr[index];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(method.main(array, commands)));
    }
}
