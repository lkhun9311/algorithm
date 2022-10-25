import java.util.*;

class Main {
    public int main(int[] d, int budget) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for(int element : d) {
            list.add(element);
        }

        Collections.sort(list);

        for(int element : list) {
            budget -= element;
            if(budget < 0) break;

            answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(method.main(d, budget));
    }
}
