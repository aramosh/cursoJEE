package modelo.negocio;

import java.util.ArrayList;

import modelo.entidad.Cliente;
import modelo.entidad.Pizza;

public class Pedido {
	
	private Cliente cliente;
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(ArrayList<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
	public int pedirCuenta() {
		int cuenta = 0;
		for (Pizza pizza : pizzas) {
			cuenta += pizza.getPrice();
		}
		return cuenta;
	}
	
	public static int calcular(Pizza p) {
		int precio = 0;
		//compruebo que se ha seleccionado un tamaño
		if(p.getSize() != ""){
			//establecemos el precio base
			switch(p.getSize()){
				case "peque":
					precio = 5;
					break;
				case "mediana":
					precio = 10;
					break;
				case "grande":
					precio = 15;
					break;
				default:
					break;
			}
			precio = precio + p.getIngredientes().size()*1;			
		}else{
			precio = -1;
		}
		return precio;
	}
}
