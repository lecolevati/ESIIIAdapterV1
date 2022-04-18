package controller;

import model.Pagamento;

public class VisaAdapter implements IServicoPagamento {

	Visa pagtoVisa;

	public VisaAdapter(Visa pagtoVisa) {
		this.pagtoVisa = pagtoVisa;
	}

	@Override
	public void pagar(Pagamento pagamento) {
		pagtoVisa.validarCartao(pagamento.getCartao());
		pagtoVisa.pagar(pagamento.getValor());
	}
	
	
}
