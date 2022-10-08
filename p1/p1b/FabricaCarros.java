package p1b;
public class FabricaCarros {
    private boolean pintura;
	private boolean construcao;
	private static FabricaCarros uniqueInstance;

	private FabricaCarros(boolean pint, boolean const){
		pintura=pint;
		construcao=const;
	}

	public void construir(){
		if (construindo()){
			construcao=false;
			pintura=false;
		}
	}

	public static FabricaCarros getInstance(){
		if (uniqueInstance==null){
			uniqueInstance= new FabricaCarros();
		}
		return uniqueInstance;
	}

	public void pintura(){
		if (!construindo() && ispintura()){
			pintura=true;
	}
	
}
	public void deliver(){
		if(!construindo() && ! ispintura()){
			pintura=true;
		}
	}
	
	public boolean construindo(){
      
		return construcao;
	}
	public boolean ispintura(){
		return pintura;
	
	}
}
