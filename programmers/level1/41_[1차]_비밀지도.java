import java.util.*;

class Main {
    public String[] main(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        List<String> list1 = numToBinaryList(n, arr1);
        List<String> list2 = numToBinaryList(n, arr2);
        List<String> result1 = new ArrayList<>(n);
        List<String> result2 = new ArrayList<>(n);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(list1.get(i).split("")[j].equals("1") | list2.get(i).split("")[j].equals("1")) {
                    result1.add("#");
                } else {
                    result1.add(" ");
                }
            }
        }

        for(int j = 0; j < result1.size(); j += n) {
            String s = "";
            for(String element : result1.subList(j, j + n)) {
                s += element;
            }
            result2.add(s);
        }
        answer = result2.toArray(new String[n]);

        return answer;
    }

    public static List<String> numToBinaryList(int n, int[] arr) {
        List<String> list = new ArrayList<>(n);

        for(int element : arr) {
            String binary = Integer.toBinaryString(element);
            int binaryLength = n - binary.length();
            if(binary.length() < n) {
                for(int i = 0; i < binaryLength; i++) {
                    binary = "0" + binary;
                }
            }
            list.add(binary);
        }

        return list;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(method.main(n, arr1, arr2)));
    }
}
