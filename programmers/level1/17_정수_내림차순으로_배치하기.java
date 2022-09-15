import java.util.*;

class Main {
    public long main(long n) {
        long answer = 0;
        long i = 0;
        StringBuilder result = new StringBuilder();
        List<Long> list = new ArrayList<>();

        while(n != 0) {
            i = n % 10;
            n /= 10;
            list.add(i);
        }

        list.sort(Comparator.reverseOrder());

        for(long element : list) {
            result.append(element);
        }

        answer = Long.parseLong(String.valueOf(result));

        return answer;
}

    public static void main(String[] args) {
        Main method = new Main();
        long n = 118372;
        System.out.println(method.main(n));
    }
}
