package model;

public class Pagamento {

	private Usuario usuario;
	private Cartao cartao;
	private double valor;
	private int parcelas;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Cartao getCartao() {
		return cartao;
	}
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	@Override
	public String toString() {
		return "Pagamento [usuario=" + usuario + ", cartao=" + cartao + ", valor=" + valor + ", parcelas=" + parcelas + "]";
	}
	
}
