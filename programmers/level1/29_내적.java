class Main {
    public int main(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0 ; i < a.length; i++) {
            answer += a[i]*b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] a= new int[]{1, 2, 3, 4};
        int[] b= new int[]{-3, -1, 0 ,2};
        System.out.println(method.main(a, b));
    }
}
