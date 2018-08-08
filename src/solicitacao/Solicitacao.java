package solicitacao;

public class Solicitacao {
	private String tipo;
	private String quantidade;
	private String dias;
	
	
	
	
	public Solicitacao(String tipo, String quantidade, String dias) {
		super();
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.dias = dias;
	}
	
	
	
	public Solicitacao() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	}
	
	
	

}
