import java.util.*;

class Main {
    public String solution(String[] seoul) {
        String answer = "";

        List<String> list = Arrays.asList(seoul);
        answer = "김서방은 " + list.indexOf("Kim") + "에 있다";

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String[] seoul = new String[]{"Jane", "Kim"};
        System.out.println(method.solution(seoul));
    }
}
