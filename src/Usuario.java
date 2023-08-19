
public class Usuario {
	private String username;
	private String senha; // Armazenar a senha em texto simples não é seguro, uma sugestão seria alterar o armazenamento em forma de hash.
	private Cliente cliente;
	private Empresa empresa;

	public Usuario() {
		super();
	}

	public Usuario(String username, String senha, Cliente cliente, Empresa empresa) {
		super();
		this.username = username;
		this.senha = senha;
		this.cliente = cliente;
		this.empresa = empresa;
	}

	public boolean isAdmin() { // Por convenção do Java é recomendado usar Camel Case para nomes de métodos, fazendo alteração de IsAdmin para isAdmin.
		return this.empresa == null && this.cliente == null;
	}

	public boolean isEmpresa() { // Por convenção do Java é recomendado usar Camel Case para nomes de métodos, fazendo alteração de IsEmpresa para isEmpresa.
		return this.empresa != null;
	}

	public boolean isCliente() { // Por convenção do Java é recomendado usar Camel Case para nomes de métodos, fazendo alteração de IsCliente para isCliente.
		return this.cliente != null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
