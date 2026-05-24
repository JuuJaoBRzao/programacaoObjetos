package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        Notificacao email = new NotificacaoEmail();
        Notificacao app = new NotificacaoApp();
        
        email.enviar("Pedido aprovado no email");
        app.enviar("Pedido aprovado no app");
        
        NotificacaoEmail e = new NotificacaoEmail();
        
        String[] lista = {"bruno@gmail.com", "guilherme@gmail.com", "leonardo@gmail.com"};
        e.enviar("Reuniao as 15hrs", lista);
        }
    }
