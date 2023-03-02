package prueba2;




public class ListaCalificaciones {
	private String nombreDelCurso;
	public void establecerNomC(String nom) {
		nombreDelCurso=nom;
	}
	
	public void mostrarMensaje( String nomCurs) {
		System.out.println("Bienvenidos al libro de calificaciones ");
		System.out.printf("Para el curso %s",nomCurs);
	}
	
	

}
