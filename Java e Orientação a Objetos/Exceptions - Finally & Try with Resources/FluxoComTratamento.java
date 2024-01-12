public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MyException exception) {
            String msg = exception.getMessage();
            System.out.println("Exception: " + msg);
            exception.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    private static void metodo1() throws MyException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MyException {
        System.out.println("Ini do metodo2");
        
        //Somente funciona com exceções
        throw new MyException("Error");

        //System.out.println("Fim do metodo2");
        
    }
}