class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
 
        agenda.adicionarContato("Maria", "(55) 99999-1234");
        agenda.adicionarContato("Pedro", "(51) 98765-4321");
 
        try {
            agenda.adicionarContato("", "99999-0000");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
 
        try {
            agenda.adicionarContato("Pedro", "");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
 
        try {
            agenda.adicionarContato(null, "99999-0000");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
