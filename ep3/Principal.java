import java.util.ArrayList;
import java.util.Collections;

public class Principal{
	public static void main(String Arg[]){
		//Declarar o array
		
		ArrayList<Nota> lista = new ArrayList<Nota>();
		//Define os valores
		
		Disciplina lp2 = new Disciplina( "Lp2", "Herbert" );
		Disciplina web = new Disciplina( "web", "Marcelão" );
		
		Aluno a0 = new Aluno( "Jonas", 17);
		Aluno a1 = new Aluno( "Carlos", 16);
		Aluno a2 = new Aluno( "victor", 3);
		Aluno a3 = new Aluno( "Ligeirinho", 89);
		Aluno a4 = new Aluno( "Eduardo", 666);
		
		lista.add(new Nota( 2, a0, lp2));
                lista.add(new Nota( 8, a0, web));
                lista.add(new Nota( 6, a1, lp2));
                lista.add(new Nota( 7, a1, web));
                lista.add(new Nota( 9.6, a2, lp2));
                lista.add(new Nota( 2.5, a2, web));
                lista.add(new Nota( 4.7, a3, lp2));
                lista.add(new Nota( 9.9, a3, web));
                lista.add(new Nota( 6.5, a4, lp2));
                lista.add(new Nota( 3.4, a4, web));
		//Mostra o array não ordenado
		
		for(int i = 0; i < 10; i++)
                        System.out.println(lista.get(i).getAluno().getNome() +"--"+ lista.get(i).getDisciplina().getNome() +": "+ lista.get(i).getNota() + " -Professor: " + lista.get(i).getDisciplina().getProfessor());
		
		System.out.println("--------------------");
		//Faz a ordenação
		
		Collections.sort(lista);
		//Mostra o vetor ordenado
		
		for(int i = 0; i < 10; i++)
                        System.out.println(lista.get(i).getAluno().getNome() +"--"+ lista.get(i).getDisciplina().getNome() +": "+ lista.get(i).getNota() + " -Professor: " + lista.get(i).getDisciplina().getProfessor());
		
                System.out.println("--------------------");
		//Responde as perguntas
		
		System.out.println("A maior nota foi: " + lista.get(0).getNota());
		
		int i = 0;
		while( lista.get(i).getDisciplina().getNome() != "Lp2")
			i++;
		System.out.println("E a maior nota de lp2 foi: " + lista.get(i).getNota());
		System.gc();
	}
}
