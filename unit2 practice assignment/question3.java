class question3 {

    public static void main (String[] args) {
        int sumSquares = 0;
        int sum = 0;
        for (int i = 0; i < 101; i++){
            sumSquares += i*i;
            sum += i;
        }

        System.out.println(sum*sum - sumSquares);

    }
}
