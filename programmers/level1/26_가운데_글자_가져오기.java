import java.util.*;

class Main {
    public String main(String s) {
        String answer = "";

        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));

        int share = s.length()/2;

        if(s.length()%2 == 0) {
            answer = String.join("", list.subList(share - 1, share + 1));
        } else {
            answer = list.get(share);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
//        String s = "abcde";
        String s = "qwer";
        System.out.println(method.main(s));
    }
}
