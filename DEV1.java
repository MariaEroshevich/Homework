public class DEV1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if((i % 3) == 0) { 
                int n = i/3;
                System.out.println(n + "*3");
            } else { 
                System.out.println(i);
            }
        }
    }
}

