package view;

import controller.IServicoPagamento;
import controller.Visa;
import controller.VisaAdapter;
import model.Pagamento;
import model.PagamentoBuilder;

public class Principal {

	public static void main(String[] args) {
		Pagamento pagto =PagamentoBuilder.builder()
				.addCartao("4444555566667777", 321)
				.addValor(500.00d)
				.get();

		Visa visa = new Visa();
		IServicoPagamento servicoPagto = new VisaAdapter(visa);
		servicoPagto.pagar(pagto);
	}

}
