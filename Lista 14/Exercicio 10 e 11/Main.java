class Main {
    public static void main(String[] args) {
        Produto livro = new Livro("Clean Code", 89.90, "Boas práticas de programação");
        Produto cd = new CD("Abbey Road", 45.00, "Álbum dos Beatles");

        System.out.println("Nome: " + livro.getNome());
        System.out.println("Preço: R$" + livro.getPreco());
        System.out.println("Descrição: " + livro.getDescricao());

        System.out.println();

        System.out.println("Nome: " + cd.getNome());
        System.out.println("Preço: R$" + cd.getPreco());
        System.out.println("Descrição: " + cd.getDescricao());
    }
}
