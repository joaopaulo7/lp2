class Singleton{
	private static Singleton instanciado = new Singleton();
	
	private Singleton(){}
	private static Singleton getObj(){
		return instanciado;
	}
}
