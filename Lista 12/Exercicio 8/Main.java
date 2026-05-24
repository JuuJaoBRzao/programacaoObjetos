package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        Reserva hotel = new ReservaDeHotel("Guilherme");
        Reserva voo = new ReservaDeVoo("Bruno");
        
        hotel.adicionar();
        voo.adicionar();
        
        hotel.cancelar();
        voo.cancelar();
        
        ReservaDeVoo voo2 = new ReservaDeVoo("Leonardo");
        
        voo2.adicionar("Executiva");
        voo2.cancelar();
        }
    }
