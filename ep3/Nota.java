public class Nota implements Comparable<Nota>{
        double nota;
        Disciplina disciplina;
	Aluno aluno;

        public Nota( double nota, Aluno aluno, Disciplina disciplina){
                this.nota = nota;
                this.disciplina = disciplina;
		this.aluno = aluno;
        }

        public double  getNota(){
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
			return -1;
        	else if( this.nota < outra.getNota())
			return 1;
		else
			return 0;
	}
}




