public class ParametrosInvalidosException extends Exception {
    // Esta classe permite que você use sua própria lógica de erro
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}