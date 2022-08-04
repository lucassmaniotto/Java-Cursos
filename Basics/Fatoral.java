public class Fatoral {
    public static void main(String[] args) {
        int count = 1;
        for(int n = 1; n <= 11; n++){
            count *= n;
            System.out.println("Fatoral de " + n + " = " + count);
        }
    }
}
