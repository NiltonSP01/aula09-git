public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.divide(10, 2));
        try {
            c.divide(1, 0);
            System.out.println("FALHOU: nao lancou excecao");
        } catch (ArithmeticException e) {
            System.out.println("OK: " + e.getMessage());
        }
    }
}