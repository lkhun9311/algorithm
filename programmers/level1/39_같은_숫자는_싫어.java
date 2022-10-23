import java.util.*;

class Main {
    public int[] main(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int element : arr) {
            if(list.size() == 0) {
                list.add(element);
                continue;
            }

            if(list.get(list.size() - 1).equals(element)) {
                continue;
            }

            list.add(element);
        }
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(method.main(arr)));
    }
}
