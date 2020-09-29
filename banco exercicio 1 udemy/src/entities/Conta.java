package entities;

public class Conta {
	private int numero;
	private String nome;
	private double valor;
	
	public Conta(int numero, String nome, double valor) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.valor = valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	

}
