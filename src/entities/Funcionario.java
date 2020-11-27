package entities;

public class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private double salario;
	public Funcionario(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
	}
	public Funcionario() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public int compareTo(Funcionario outro) {
		// TODO Auto-generated method stub
		//o sinal de menos irá reverter a lógica da ordenação o que era para retornar positivo
		//irá retornar negativo, colocando em ordem decrescente
		return -Double.compare(salario, outro.getSalario());
	}
	
	

}
