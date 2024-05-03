package br.com.zhant.estudo_spring.models;

public class Client {

	private int id;
	private String name;
	private String cpf;
	
	public Client(int id, String nome, String cpf) {
		super();
		this.id = id;
		this.name = nome;
		this.cpf = cpf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
