
public class Produto {
	private Integer produtoId; // recomenda-se utilizar nomes mais descritivos, alterando então "id" para "produtoId". 
	private String nome;
	private Integer quantidade;
	private Double preco;
	private Empresa empresa;

	public Produto(Integer produtoId, String nome, Integer quantidade, Double preco, Empresa empresa) {
		super();
		this.produtoId = produtoId;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.empresa = empresa;
	}

	public Produto() {
		super();
	}
	
	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
