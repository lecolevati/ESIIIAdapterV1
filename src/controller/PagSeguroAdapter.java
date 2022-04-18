package controller;

import model.Pagamento;

public class PagSeguroAdapter implements IServicoPagamento {

	PagSeguro pagtoPS;
	
	public PagSeguroAdapter(PagSeguro pagtoPS) {
		this.pagtoPS = pagtoPS;
	}

	@Override
	public void pagar(Pagamento pagamento) {
		pagtoPS.fazerLogin(pagamento.getUsuario());
		pagtoPS.realizarPagamento(pagamento.getValor(), pagamento.getParcelas());
	}

}
