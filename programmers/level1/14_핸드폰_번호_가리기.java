class Main {
    public String main(String phone_number) {
        String answer = "";

        String[] phone_number_array = phone_number.split("");

        for(int i=0; i< phone_number_array.length; i++){
            if(i< phone_number_array.length-4){
                answer += "*";
            } else answer += phone_number_array[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String answer = "01033334444";
//        String answer = "027778888";
        System.out.println(method.main(answer));
    }
}
