package model;

public class PagamentoBuilder {

	private Usuario usuario;
	private Cartao cartao;
	private Pagamento pagamento;
	
	public PagamentoBuilder() {
		this.usuario = new Usuario();
		this.cartao = new Cartao();
		this.pagamento = new Pagamento();
	}
	
	public static PagamentoBuilder builder() {
		return new PagamentoBuilder();
	}
	
	public PagamentoBuilder addUsuario(int id, String nome) {
		this.usuario.setId(id);
		this.usuario.setNome(nome);
		return this;
	}
	
	public PagamentoBuilder addCartao(String numero, int cvv) {
		this.cartao.setNumeroCartao(numero);
		this.cartao.setCvv(cvv);
		return this;
	}
	
	public PagamentoBuilder addValor(double valor) {
		this.pagamento.setValor(valor);
		return this;
	}
	
	public PagamentoBuilder addParcelas(int parcelas) {
		this.pagamento.setParcelas(parcelas);
		return this;
	}
	
	public Pagamento get() {
		this.pagamento.setUsuario(usuario);
		this.pagamento.setCartao(cartao);
		return pagamento;
	}
}
