class Main {
//    방법1. Math.pow(a,b); a의 b승 활용
    public int main(int n) {
        int answer = 0;
        int pow10 = 0;
        int length = String.valueOf(n).length();

        for(int i = length; i > 0; i--) {
            pow10 = (int) Math.pow(10, i-1);
            answer += n / pow10;
            n -= (n / pow10) * pow10;
        }

        return answer;

//        방법2. While문 활용
//        int answer = 0;
//        int sum = 0;
//
//        while(n != 0){
//            sum += n%10;
//            n = n/10;
//        }
//        answer = sum;
//
//        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int n = 123;
        System.out.println(method.main(n));
    }
}
