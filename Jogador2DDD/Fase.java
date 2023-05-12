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
        System.out.println("Guerreiro: " + guerreiro.getNome() + " est� andando");
        System.out.println("Posi��o X:" + guerreiro.getX() + " Posi��o Y :" + guerreiro.getY());
        System.out.println("--------------------------------------------------------");
        System.out.println("Mago: " + mago.getNome() + " est� andando");
        System.out.println("Posi��o X: " + mago.getX() + " Posi��o Y : " + mago.getY());
        System.out.println("--------------------------------------------------------");
        System.out.println("A Bola de fogo est� se movendo");
        System.out.println("Posi��o X: " + bolaDeFogo.getX() + " Posi��o Y: " + bolaDeFogo.getY());
        System.out.println("--------------------------------------------------------");
        System.out.println("O drag�o est� se movendo");
        System.out.println("Posi��o X: " + dragao.getX() + " Posi��o Y:" + dragao.getY());
        System.out.println("--------------------------------------------------------");
    }
}	
