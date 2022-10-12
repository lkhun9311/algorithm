class Main {
    public String main(String s, int n) {
        String answer = "";

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == ' ') { answer += " "; continue; }

            if(ch >= 'A' && ch <= 'Z'){
                if(ch + n > 'Z') {
                    answer += (char)(ch-26+n);
                } else {
                    answer += (char)(ch+n);
                }
            }
            else if (ch >= 'a' && ch <= 'z') {
                if(ch + n > 'z') {
                    answer += (char)(ch-26+n);
                } else {
                    answer += (char)(ch+n);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "a B z";
        int n = 4;
        System.out.println(method.main(s, n));
    }
}
