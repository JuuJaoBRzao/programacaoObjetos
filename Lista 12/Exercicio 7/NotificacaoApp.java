package pkg;

public class NotificacaoApp extends Notificacao{
	
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando notificacao do aplicativo: "+mensagem);
	}
}
