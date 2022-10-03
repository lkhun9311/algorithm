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
