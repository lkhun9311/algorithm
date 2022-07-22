import java.util.*;

class Main {
    public static String solution(int a, int b) {
        String answer = "";
        String[] dateName = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] dayNumOFMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalOfDayNum = 0;

        for(int i=0; i<a-1; i++){
            totalOfDayNum += dayNumOFMonth[i];
        }

        totalOfDayNum += (b-1);
        answer = dateName[totalOfDayNum%7];

        return answer;
    }

    public static void main(String[] args){
        Main method = new Main();
        System.out.println(method.solution(5,24));
    }
}
