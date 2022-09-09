import java.util.*;

class Main {
    public int[] main(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        String[] nToStrArr = String.valueOf(n).split("");

        List<Integer> list = new ArrayList<>();
        for(String i : nToStrArr) {
            list.add(Integer.valueOf(i));
        }

        Collections.reverse(list);

        for(int j =0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        long n = 12345;
        System.out.println(Arrays.toString(method.main(n)));
    }
}
