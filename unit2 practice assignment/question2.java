class question2 {

    public static void main (String[] args) {
        int x = 0;
        int y = 1;
        int t = 0;
        //int n = 0;
        //2. get user input
        //while (t < 4){
        for(int i = 0; i < 4000000; i = x + y){
            if(i%2 == 0){
                t += i;
            }
            x = y;
            y = i;
        }

        System.out.println(t);

    }
}
