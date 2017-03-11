public class Aluno implements Comparable<Aluno>{
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
	public int compareTo(Aluno outro){
		if(this.idade < outro.getIdade())
			return 1;
		else if(this.idade > outro.getIdade())
			return -1;
		else
			return 0;
	}
}
