class question1 {

    public static void main (String[] args) {
        int x = 0;
        int t = 0;
        //2. get user input
        for(int n = 1; n <= 999; n++){
            while(n%5 == 0|| n%3 == 0){   
            t = t + n;
            n++;
        }
        }
        System.out.println("Answer: " + t);
    }
}