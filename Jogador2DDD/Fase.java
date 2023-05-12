package br.com.fiap.jogador2;

public class Fase {
	
	public static void carregar() {
        Guerreiro guerreiro = new Guerreiro("Wanderwellingtonson Jr.");
        Mago mago = new Mago("Clestrovacio Segundo");
        BolaDeFogo bolaDeFogo = new BolaDeFogo(10);
        Dragao dragao = new Dragao();

        guerreiro.mover();
        mago.mover();
        bolaDeFogo.mover();
        dragao.mover();

        System.out.println("--------------------------------------------------------");
        System.out.println("Guerreiro: " + guerreiro.getNome() + " está andando");
        System.out.println("Posição X:" + guerreiro.getX() + " Posição Y :" + guerreiro.getY());
        System.out.println("--------------------------------------------------------");
        System.out.println("Mago: " + mago.getNome() + " está andando");
        System.out.println("Posição X: " + mago.getX() + " Posição Y : " + mago.getY());
        System.out.println("--------------------------------------------------------");
        System.out.println("A Bola de fogo está se movendo");
        System.out.println("Posição X: " + bolaDeFogo.getX() + " Posição Y: " + bolaDeFogo.getY());
        System.out.println("--------------------------------------------------------");
        System.out.println("O dragão está se movendo");
        System.out.println("Posição X: " + dragao.getX() + " Posição Y:" + dragao.getY());
        System.out.println("--------------------------------------------------------");
    }
}	
