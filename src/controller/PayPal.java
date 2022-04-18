package controller;

import model.Usuario;

public class PayPal {

	public void pay(Usuario u, double valor) {
		System.out.println("User login: "+u.getNome()+" - ID: "+u.getId());
		System.out.println("Pay: US$"+valor);
	}
	
}
