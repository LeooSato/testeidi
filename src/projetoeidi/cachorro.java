package projetoeidi;

public class cachorro {

	String nome;
	boolean castrado;
	int sexo;
	
	public cachorro(String nome,boolean castrado,int sexo) {
		this.nome = nome;
		this.castrado = castrado;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return "cachorro: " + this.nome + ", " + this.sexo + "," + castrado;
	}
	
	
}
