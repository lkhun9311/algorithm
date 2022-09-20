import java.util.*;

class Main {
    public int[] main(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int element : arr) {
            if(element%divisor == 0) list.add(element);
        }

        if(list.size() == 0) list.add(-1);

        answer = list.stream().sorted(Comparator.naturalOrder()).mapToInt(Integer::intValue).toArray();

        return answer;
}

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        System.out.println(Arrays.toString(method.main(arr, divisor)));
    }
}
