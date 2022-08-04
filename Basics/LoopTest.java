public class LoopTest {
    public static void main(String[] args) {
        for(int mult = 1; mult <= 10; mult++){
            for(int count = 0; count <= 10; count++){
                System.out.print(mult * count);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int line = 0; line <= 10; line++){
            for(int column = 0; column <= line; column++){
                System.out.print('*');
            }
            System.out.println();
        }
    }   
}
