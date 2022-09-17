class Main {
    public String main(int n) {
        String answer = "";
        int i = n/2;

        while (i != 0) {
            answer += "수박";
            i -= 1;
        }

        if(n%2 == 1) answer += "수";

        return answer;
}

    public static void main(String[] args) {
        Main method = new Main();
        int n = 3;
        System.out.println(method.main(n));
    }
}
