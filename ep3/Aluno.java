public class Aluno{
	String nome;
	int idade;
	
	public Aluno(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome(){
		return this.nome;
	}
        public int getIdade(){
                return this.idade;
        }
	public int compareTo(Aluno o){
		return Alunos.compareTo(o.toString());
	}
}
