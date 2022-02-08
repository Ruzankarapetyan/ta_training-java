public class RandomNum {
     public static void main(String[] args) {
     int n = Integer.parseInt(args[0]);
        int a = 0; 
        int b = 150; 
        for (int i = 0; i <= n; i++) {
            int randomnumb = a + (int) (Math.random() * b);
            System.out.println(randomnumb);
                    }
                    System.out.println();
           for ( int i = 0; i <= n; i++) {
            int randomnumb = a + (int) (Math.random() * b);
           System.out.print(" " + randomnumb);
    }
}
}