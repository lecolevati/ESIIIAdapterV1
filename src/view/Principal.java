package view;

import controller.PagSeguro;
import controller.PayPal;
import controller.Visa;
import model.Cartao;
import model.Usuario;

public class Principal {

	public static void main(String[] args) {
		Usuario u = new Usuario();
		u.setId(1001);
		u.setNome("Fulano de Tal");
		
		double valor = 500.00d;
		int parcelas = 4;
		
		PagSeguro pagtoPS = new PagSeguro();
		pagtoPS.fazerLogin(u);
		pagtoPS.realizarPagamento(valor, parcelas);
		

		Cartao cartao = new Cartao();
		cartao.setNumeroCartao("4444555566667777");
		cartao.setCvv(321);
		
		Visa pagtoVisa = new Visa();
		pagtoVisa.validarCartao(cartao);
		pagtoVisa.pagar(valor);
		
		
		PayPal pagtoPP = new PayPal();
		pagtoPP.pay(u, valor);
	}

}
