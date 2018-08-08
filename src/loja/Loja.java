package loja;

public class Loja {
	private String nome;
	private Double valorDiaSemanaRegular;
	private Double valorDiaSemanaFidelidade;
	private Double valorFimDeSemanaRegular;
	private Double valorFimDeSemanaFidelidade;
	private Integer limite;
	private Double total;
	private String carro;
	
	
	
	
	
	public Loja(String nome, Double valorDiaSemanaRegular, Double valorDiaSemanaFidelidade,
			Double valorFimDeSemanaRegular, Double valorFimDeSemanaFidelidade, Integer limite, Double total,
			String carro) {
		super();
		this.nome = nome;
		this.valorDiaSemanaRegular = valorDiaSemanaRegular;
		this.valorDiaSemanaFidelidade = valorDiaSemanaFidelidade;
		this.valorFimDeSemanaRegular = valorFimDeSemanaRegular;
		this.valorFimDeSemanaFidelidade = valorFimDeSemanaFidelidade;
		this.limite = limite;
		this.total = total;
		this.carro = carro;
	}



	public Loja() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValorDiaSemanaRegular() {
		return valorDiaSemanaRegular;
	}
	public void setValorDiaSemanaRegular(Double valorDiaSemanaRegular) {
		this.valorDiaSemanaRegular = valorDiaSemanaRegular;
	}
	public Double getValorDiaSemanaFidelidade() {
		return valorDiaSemanaFidelidade;
	}
	public void setValorDiaSemanaFidelidade(Double valorDiaSemanaFidelidade) {
		this.valorDiaSemanaFidelidade = valorDiaSemanaFidelidade;
	}
	public Double getValorFimDeSemanaRegular() {
		return valorFimDeSemanaRegular;
	}
	public void setValorFimDeSemanaRegular(Double valorFimDeSemanaRegular) {
		this.valorFimDeSemanaRegular = valorFimDeSemanaRegular;
	}
	public Double getValorFimDeSemanaFidelidade() {
		return valorFimDeSemanaFidelidade;
	}
	public void setValorFimDeSemanaFidelidade(Double valorFimDeSemanaFidelidade) {
		this.valorFimDeSemanaFidelidade = valorFimDeSemanaFidelidade;
	}
	public Integer getLimite() {
		return limite;
	}
	public void setLimite(Integer limite) {
		this.limite = limite;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}

	
}
