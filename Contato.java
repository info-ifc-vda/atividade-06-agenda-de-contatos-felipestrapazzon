import java.util.ArrayList;

public class Contato {
    private String nome;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void adicionarEmail(Email email) {
        emails.add(email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");

        sb.append("Telefones:\n");
        for (Telefone t : telefones) {
            sb.append("  - ").append(t).append("\n");
        }

        sb.append("Emails:\n");
        for (Email e : emails) {
            sb.append("  - ").append(e).append("\n");
        }

        return sb.toString();
    }
}
    