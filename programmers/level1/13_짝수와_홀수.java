class Main {
    public String main(int num) {
        String answer = "";

        if(num%2 == 0){
            answer = "Even";
        }
        else{
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int answer = 1;
        System.out.println(method.main(answer));
    }
}
