import java.util.HashMap;

class Main {
    public String main(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String element : participant) {
            hashMap.put(element, hashMap.getOrDefault(element, 0) + 1);
        }

        for(String element : completion) {
            hashMap.put(element, hashMap.get(element) - 1);
        }


        for(String element : hashMap.keySet()) {
            if(hashMap.get(element) != 0) {
                answer += element;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(method.main(participant, completion));
    }
}
