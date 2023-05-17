package Carro;
import javax.swing.*;
public class MainMyOwnAutoShop {

	public static void main(String[] args) {
		Sedan sedan = new Sedan();
        sedan.Velocidad = 196;
        sedan.PrecioVenta = 34000;
        sedan.Color = "kk";
        sedan.Longitud = 22;
       
        Ford ford = new Ford();
        ford.Velocidad = 230;
        ford.year = 2008;
        ford.PrecioVenta = 28000;
        ford.Color = "marron";
        ford.descFabricante = 5000;
        
        Ford ford2 = new Ford();
        ford2.Velocidad = 160;
        ford2.PrecioVenta = 28000;
        ford2.Color = "blanco";
        ford2.year = 2020;
        ford2.descFabricante = 6000;
        
        Car car = new Car();
        car.Velocidad = 150;
        car.PrecioVenta = 18000;
        car.Color = "azul";
        
        Truck truck = new Truck();
        truck.Velocidad = 180;
        truck.PrecioVenta = 30000;
        truck.Color = "verde";
        truck.Peso = 3000;
        
        System.out.println("Precio de venta del Sedan: " + sedan.getSalePrice());
        System.out.println("Precio de venta del Ford 1: " + ford.getSalePrice());
        System.out.println("Precio de venta del Ford 2: " + ford2.getSalePrice());
        System.out.println("Precio de venta del Car: " + car.getSalePrice());
        System.out.println("Precio de venta del Truck: " + truck.getSalePrice());
		
		

	}

}
