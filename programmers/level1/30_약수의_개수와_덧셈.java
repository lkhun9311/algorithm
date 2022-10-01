class Main {
    public int main(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            if(checkEvenOrNotOfNumberOfFactor(i)) { answer += i; }
            else answer -= i;
        }

        return answer;
    }

    public boolean checkEvenOrNotOfNumberOfFactor(int num) {
        boolean evenOrNot = false;
        int result = 0;

        for(int i = 1; i <= num; i++) {
            if(num%i == 0 ) result++;
        }

        if(result%2 == 0) evenOrNot = true;

        return evenOrNot;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int left = 13;
        int right = 17;
        System.out.println(method.main(left, right));
    }
}
