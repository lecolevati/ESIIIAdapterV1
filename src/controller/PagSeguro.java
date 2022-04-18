package controller;

import model.Usuario;

public class PagSeguro {

	public void fazerLogin(Usuario u) {
		System.out.println("Login realizado do usuario: " + u.getNome() + " - ID: " + u.getId());
	}

	public void realizarPagamento(double valor, int parcelas) {
		System.out.println("Pago no PagSeguro, valor: R$" + valor + " em " + parcelas + " parcelas");
	}

}
