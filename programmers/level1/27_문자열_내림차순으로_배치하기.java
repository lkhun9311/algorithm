import java.util.*;
import java.util.stream.Collectors;

class Main {
    public String main(String s) {
        StringBuilder answer = new StringBuilder();

        List<String> list = Arrays.stream(s.split(""))
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toList());

        for(String element : list) {
            answer.append(element);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "Zbcdefg";
        System.out.println(method.main(s));
    }
}
