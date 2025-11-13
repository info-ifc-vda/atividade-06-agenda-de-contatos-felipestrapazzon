public class Email {
    private String rotulo;
    private String endereco;

    public Email(String rotulo, String endereco) {
        this.rotulo = rotulo;
        this.endereco = endereco;
    }

    public String getRotulo() {
        return rotulo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String toString() {
        return rotulo + ": " + endereco;
    }
}
