//유클리드 호제법
//        최대 공약수 -> max를 min으로 나눈 나머지를 remaider라고 하면 최대공약수는 min과 remainder의 최대공약수이다.(재귀함수 활용)
//        최소 공배수 -> (max*min)/최대공약수(max, min)

import java.util.*;

class Main {
    public int[] main(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        List<Integer> list = new ArrayList<>();

        list.add(greatestCommonFactor(max, min));
        list.add(greatestCommonMultiple(max ,min));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int greatestCommonFactor(int max, int min) {
        if(min == 0) return max;
        return greatestCommonFactor(min, max%min);
    }

    public int greatestCommonMultiple(int max, int min) {
        return (max*min)/greatestCommonFactor(max, min);
    }

    public static void main(String[] args) {
        Main method = new Main();
        int n = 2;
        int m = 4;
        System.out.println(Arrays.toString(method.main(n, m)));
    }
}
