package poo;

public class Furgoneta extends Coche {//CLASE COCHE ES EL PADRE DE CLASE FURGONETA

	private int capacidad_carga;
	private int plazas_extra;
	
	
	public Furgoneta(int plazas_extra, int capacidad_carga ){//CONSTRUCTOR 
		
		super();//LLAMA AL CONSTRUCTOR DE LA CLASE PADRE 
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	public String dimeDatosFurgoneta() {
		return " La capacidad de carga es: "+capacidad_carga+"\n"
				+ "Y las plazas son: "+plazas_extra;
	}
	
}
