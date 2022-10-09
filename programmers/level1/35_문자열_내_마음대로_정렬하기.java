import java.util.*;

class Main {
    public String[] main(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();

        for(String element : strings) {
            list.add(element.split("")[n] + element);
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            int len = list.get(i).length();
            answer[i] = list.get(i).substring(1, len);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String[] strings = {"abcd", "cdx", "abce", "cda"};
        int n = 2;
        System.out.println(Arrays.toString(method.main(strings, n)));
    }
}
