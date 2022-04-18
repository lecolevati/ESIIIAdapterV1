package controller;

import model.Pagamento;

public class PayPalAdapter implements IServicoPagamento{
	
	PayPal pagtoPP;

	public PayPalAdapter(PayPal pagtoPP) {
		this.pagtoPP = pagtoPP;
	}

	@Override
	public void pagar(Pagamento pagamento) {
		pagtoPP.pay(pagamento.getUsuario(), pagamento.getValor());		
	}
	

}
