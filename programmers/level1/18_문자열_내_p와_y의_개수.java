class Main {
    boolean main(String s) {
        boolean answer = true;
        int a = 0, b = 0;

        for(String element : s.toLowerCase().split("")) {
            if(element.equals("p")) a += 1;
            if(element.equals("y")) b += 1;
        }

        if(a == 0 && b == 0) return answer;
        if(a == b) return answer;
        else answer = false;

        return answer;
}

    public static void main(String[] args) {
        Main method = new Main();
        String s = "pPoooyY";
        System.out.println(method.main(s));
    }
}
