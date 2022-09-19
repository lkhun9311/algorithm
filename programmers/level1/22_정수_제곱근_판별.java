class Main {
    public long main(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);

        if(sqrt == (int) sqrt) answer = (long) Math.pow((sqrt+1), 2);
        else answer = -1;

        return answer;
}

    public static void main(String[] args) {
        Main method = new Main();
        long n = 121;
        System.out.println(method.main(n));
    }
}
