class Main {
    public String main(String s) {
        String answer = "";
        String[] list = s.split("");
        int index = 0;

        for(String element : list) {
            if(element.equals(" ")) {
                index = 0;
            } else {
                index++;
            }

            answer += index%2 != 0 ? element.toUpperCase() : element.toLowerCase();
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "    try hello world ";
//        String s = "try hello world";
        System.out.println(method.main(s));
    }
}
