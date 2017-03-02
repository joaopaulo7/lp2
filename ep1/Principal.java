public class Principal{
	public static void main(String args[]){
		Lista l1 = new Lista();
		l1.inserir(2);
		l1.inserir(3);
		l1.mostrar();
                System.out.println("-------");
		l1.remover();
		l1.mostrar();
                System.out.println("-------");
		l1.inserir(10);
		l1.remover();
		l1.mostrar();
                System.out.println("-------");
		System.out.println(l1.pesquisar(14489832));
		l1.remover();
                System.out.println("-------");
		l1.mostrar();
	}
}
