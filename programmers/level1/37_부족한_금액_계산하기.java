class Main {
    public long main(int price, int money, int count) {
        long answer = 0;
        long total = (long) price * (count * (count + 1) / 2); // (long)을 붙이는 것이 핵심

        if(total > money) {
            answer = total - money;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(method.main(price, money, count));
    }
}
