package pkg;

public class NotificacaoEmail extends Notificacao{
	
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando notificação por email: "+mensagem);
	}
	
	public void enviar(String mensagem, String[] destinatarios) {
		for(int i = 0; i < destinatarios.length; i++) {
			System.out.println("Email para "+destinatarios[i]+" : "+mensagem);
		}
	}
}
