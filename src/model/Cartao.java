package model;

public class Cartao {

	private String numeroCartao;
	private int cvv;
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	@Override
	public String toString() {
		return "Cartao [numeroCartao=" + numeroCartao + ", cvv=" + cvv + "]";
	}
	
}
