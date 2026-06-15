class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 3);
        Animal gato = new Gato("Mimi", 5);

        cachorro.emitirSom();
        gato.emitirSom();

        cachorro.setNome("Bolt");
        System.out.println("Nome atualizado: " + cachorro.getNome() + ", Idade: " + cachorro.getIdade());
    }
}
