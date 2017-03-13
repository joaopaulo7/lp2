public class Nota implements Comparable<Nota>{
        double nota;
        Disciplina disciplina;
	Aluno aluno;

        public Nota( double nota, Disciplina disciplina, Aluno aluno){
                this.nota = nota;
                this.disciplina = disciplina;
		this.aluno = aluno;
        }

        public doble  getNota(){
                return this.nota;
        }
        public Disciplina  getDisciplina(){
                return this.disciplina;
        }
        public Aluno  getAluno(){
                return this.aluno;
        }
	
	public int compareTo( Nota outra){
		if( this.nota > outra.getNota())
			return 1;
        	else if( this.nota < outra.getNota())
			return -1;
		else
			return 0;
	}
}




