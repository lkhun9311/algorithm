class Main {
    public boolean main(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                    answer = false;
                    break;
                }
            }
        } else answer = false;

        return answer;
    }

    // 유니코드 범위
    // 숫자 48 ~ 57
    // 영문 소문자 65 ~ 90
    // 영문 대문자 97 ~ 122

    public static void main(String[] args) {
        Main method = new Main();
        String s = "a234";
        System.out.println(method.main(s));
    }
}
