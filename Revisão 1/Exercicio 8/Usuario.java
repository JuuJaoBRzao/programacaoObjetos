public class Usuario {
    private String nomeUsuario;
    private String senha;
    private boolean logado = false;

    public Usuario(String nomeUsuario, String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNomeUsuario(){
        return getUsuario;
    }

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean isLogado(){
        return logado;
    }

    public void setLogado(boolean logado){
        this.logado = logado;
    }

    public void login(String usuario, String senha){
        if (this.nomeUsuario.equals(usuario) && (this.senha.equals(senha))){
            this.logado = true;
            System.out.println("Login feito com sucesso");
        } else {
            System.out.println("Nome de usuario ou senha incorretos");
        }
    }

    public void logout(){
        if(this.logado = false){
        System.out.println("Logout feito com sucesso");
        }
    }

    public void exibirStatus(){
        if(this.logado){
            System.out.println("Usuario esta logado");
        } else {
            System.out.println("Usuario não esta logado");
        }
    }
}
