import java.util.ArrayList;

public class Principal{
	public static void main(String Arg[]){
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		for(int i = 0; i < 5; i++)
		{
			lista.add(new Aluno("joao", i*10));
		}
		lista.sort();
		for(int i = 0; i < 5; i++)
                {
                        System.out.println(lista.get(i).getIdade() +"--"+ lista.get(i).getNome());
                }

	}
}
