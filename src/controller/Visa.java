package controller;

import model.Cartao;

public class Visa {

	public void validarCartao(Cartao cartao) {
		System.out.println("Cartão: "+cartao.getNumeroCartao()+" CVV: "+cartao.getCvv()+"  válido");
	}
	
	public void pagar(double valor) {
		System.out.println("Pago com VISA, valor: R$"+valor);
	}
	
}
