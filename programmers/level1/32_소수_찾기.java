import java.util.*;

//소수 찾기(방법 1. Math.sqrt(n)을 활용해 소수 찾아내기 최적화)
class Main {
    public int main(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 2; i <= n; i++) {
            if(isPrimeNumber(i)) list.add(i);
        }
        answer = list.size();

        return answer;
    }

    public boolean isPrimeNumber(int n) {
        boolean result = true;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int n = 10;
        System.out.println(method.main(n));
    }
}

//소수 찾기(방법 2. 에라토스테네스의 체)
// Math.sqrt(n)보다 작거나 같은 소수둘의 배수는 모두 소수가 아니다.
//class Main {
//    public int main(int n) {
//        int answer = 0;
//        List<Integer> arr = new ArrayList<>(Arrays.asList(0, 0));
//
//        for(int i = 2; i <= n; i++) {
//            arr.add(i);
//        }
//
//        for(int element : filter(n, arr)) {
//            if(element != 0) answer++;
//        }
//
//        return answer;
//    }
//
//    public List<Integer> filter(int n, List<Integer> arr) {
//
//        for(int i = 2; i <= Math.sqrt(n); i++) {
//            if(arr.get(i) == 0) continue;
//            for(int j = 2*i; j <= n; j += i) {
//                arr.set(j, 0);
//            }
//        }
//
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        int n = 10;
//        System.out.println(method.main(n));
//    }
//}
