package br.com.fiap.jogador2;

import java.util.Random;

public class Mago extends Jogador {

	private int x;
	private int y;
	private int mp = 10;
	
	public Mago(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
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

	public int getMp() {
		return mp;
	}
	
	
}	