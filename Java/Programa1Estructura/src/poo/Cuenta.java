package poo;

public class Cuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double TipoDeInteres;
	
	public void asignarNombre(String nom) {
		
		if (nom.length()==0) {
			System.out.println("Error: cadena vacia");		
			}
		nombre=nom;
	}
	public String obtenerNombre() {
		return nombre;
	}
	public void aisgnarCuenta(String cue)
	{
		if (cue.length()==0) {
			System.out.println("Error: cuenta no valida");
			return;
		}
		cuenta=cue;
	}
	public String obtenercuenta()
	{
		return cuenta;
	}
	public double estado()
	{
		return saldo;
		
	}
	public void ingreso(double cantidad)
	{
		if(cantidad<0)
		{
			System.out.println("Error: Cantidad Negativa ");
		}
		saldo=saldo+cantidad;
	}
	public void reintegro(double cantidad)
	{
		if(saldo-cantidad<0)
		{
			System.out.println("Error: No dispone de saldo ");
		}
		saldo=saldo-cantidad;
	}
	public void asignarTipoDeInteres(double tipo)
	{
		if(tipo<0)
		{
			System.out.println("Error: Tipo no valido ");
		}
		TipoDeInteres=tipo;
	}
	public double obtenerTipoDeInteres()
	{
		return TipoDeInteres;
	}
	

}
