package br.com.fiap.jogador2;

import java.util.Random;

public class Guerreiro extends Jogador {
	
	private int x;
	private int y;

	public Guerreiro(String nome) {
		super(nome);
	}

	@Override
	public void mover() {
		Random aleatorio = new Random();
        x = aleatorio.nextInt(10);
        y = aleatorio.nextInt(10);
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	
}