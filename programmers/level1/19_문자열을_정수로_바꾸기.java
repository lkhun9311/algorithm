class Main {
    public int main(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
}

    public static void main(String[] args) {
        Main method = new Main();
        String s = "-1234";
        System.out.println(method.main(s));
    }
}
