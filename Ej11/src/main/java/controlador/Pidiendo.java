package controlador;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
@ManagedBean(eager = true)
@ApplicationScoped
public class Pidiendo {
	
	private int pedidos;

	public int getPedidos() {
		return pedidos;
	}

	public void setPedidos(int pedidos) {
		this.pedidos = pedidos;
	}	
	

}
