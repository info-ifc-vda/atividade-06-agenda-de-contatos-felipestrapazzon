public class Main {
    public static void main(String[] args) {

        // Criando a agenda
        Agenda agenda = new Agenda();

        // Criando contatos
        Contato contato1 = new Contato("Alice");
        contato1.adicionarTelefone(new Telefone("celular", "99999-1111"));
        contato1.adicionarTelefone(new Telefone("casa", "3232-1111"));
        contato1.adicionarEmail(new Email("pessoal", "alice@gmail.com"));
        contato1.adicionarEmail(new Email("trabalho", "alice@empresa.com"));

        Contato contato2 = new Contato("Bruno");
        contato2.adicionarTelefone(new Telefone("celular", "98888-2222"));
        contato2.adicionarEmail(new Email("pessoal", "bruno@hotmail.com"));

        Contato contato3 = new Contato("Carla");
        contato3.adicionarTelefone(new Telefone("celular", "97777-3333"));
        contato3.adicionarEmail(new Email("pessoal", "carla@yahoo.com"));

        // Adicionando os contatos à agenda
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        // Listando todos os contatos
        System.out.println("===== LISTA INICIAL DE CONTATOS =====");
        agenda.listarContatos();

        // Removendo um contato
        System.out.println("\n===== REMOVENDO CONTATO: Bruno =====");
        boolean removido = agenda.removerContato("Bruno");
        System.out.println(removido ? "Contato removido com sucesso!" : "Contato não encontrado.");

        // Listando novamente
        System.out.println("\n===== LISTA APÓS REMOÇÃO =====");
        agenda.listarContatos();

        // Adicionando novo contato
        System.out.println("\n===== ADICIONANDO NOVO CONTATO: Daniel =====");
        Contato contato4 = new Contato("Daniel");
        contato4.adicionarTelefone(new Telefone("trabalho", "95555-4444"));
        contato4.adicionarEmail(new Email("trabalho", "daniel@empresa.com"));
        agenda.adicionarContato(contato4);

        // Listando novamente
        System.out.println("\n===== LISTA FINAL =====");
        agenda.listarContatos();
    }
}
