public class TesteSaca {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(123, 321);
        contaCorrente.deposita(200.0);
        try {
            contaCorrente.saca(210.0);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(contaCorrente.getSaldo());
    }

}
