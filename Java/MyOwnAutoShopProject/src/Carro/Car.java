package Carro;

public class Car {
	
	int Velocidad;
	double PrecioVenta;
	String Color;
	
	double getSalePrice() {
		return PrecioVenta;
	}
	
}



class Truck extends Car{
	
	int Peso;
	double getSalePrice() {
		
		if(Peso>2000) {
			return super.getSalePrice() -( 0.1 *super.getSalePrice());
		}
		else {
			return super.getSalePrice()-( 0.2 *super.getSalePrice());
		}
	}

}

class Ford extends Car{
	
	int year;
	int descFabricante;
	double getSalePrice() {
		return super.getSalePrice()-descFabricante;
	}
	
}

class Sedan extends Car{
	int Longitud;
	double getSalePrice() {
		if(Longitud>20) {
			return super.getSalePrice()-( 0.05 *super.getSalePrice());
		}
		else {
			return super.getSalePrice()-( 0.1 *super.getSalePrice());
		}
	}
	
}
