package ex_6_8;

public class Funcionario {

	String nome;
	private double salario;
	private final int identificador;
	private static int numFuncionarios;
	
	
	
	public Funcionario(){
		identificador = ++numFuncionarios;
	}
	public Funcionario(String nome){
		setNome(nome);
		identificador = ++numFuncionarios;
	}
	
	
	//////////////
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
	public int getIdentificador() {
		return identificador;
	}
	
	//////////////
	double getGanhoAnual(){
			return 12 * this.salario;
		}
	
	
	/////////////
	
	
}
