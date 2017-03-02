public class Lista{
	private No cabeca, pe;

	public void mostrar(){
		No cursor = cabeca;
                while(cursor != null)
                {
                        System.out.println(cursor.getItem());
			cursor = cursor.getProx();
                }
	}

	public void inserir(int item){
		No novo = new No();
		novo.setItem(item);
		if(cabeca == null)
		{
			this.pe = novo;
			cabeca = pe;
		}else
		{
			novo.setAnt(pe);
			pe.setProx(novo);
			pe=novo;
		}
	}
	public void remover(){
		this.pe = pe.getAnt();
		if(pe == null)
			cabeca = null;
		else
			this.pe.setProx(null);
	}

	public  boolean pesquisar(int pesquisado){
		No cursor = cabeca;
		while(cursor != null && cursor.getItem() != pesquisado)
			cursor = cursor.getProx();
		if(cursor == null)
		{
			return false;
		}else
		{
			return true;
		}
	}

	private class No{
		private No prox, ant;
		private int item;

		public void  setItem(int novo){
			this.item =novo;
		}
	        	public void  setAnt(No novo){
      			this.ant =novo;
        	}
        	public void  setProx(No novo){
                	this.prox =novo;
        	}
	
		 public int  getItem(){
               		 return this.item;
        	}
         	public No  getAnt(){
                	return this.ant;
        	}
         	public No  getProx(){
                	return this.prox;
        	}
	}
}

