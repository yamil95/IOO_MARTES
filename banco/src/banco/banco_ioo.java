package banco;

import java.util.ArrayList;
import java.util.List;

public class banco_ioo {
	
	private List <cliente> lista_clientes = new ArrayList <cliente>();
	
	
	public banco_ioo() {
		
		
	}
	
	

	public void crear_cliente (String nombre, double dni , String telefono) {
		
		cliente cliente_aux = new cliente (nombre,dni,telefono);
		
		if (!lista_clientes.contains(cliente_aux)) {
			
			lista_clientes.add(cliente_aux);
		}
		
		
		
	}
	
	
	
	
	public void agregar_cuenta_cliente (double dni,String nombre_cuenta ) {
		
		
		for (cliente cliente_aux : lista_clientes) {
			
			if (cliente_aux.getDni() == dni) {
				
				caja_ahorro caja_aux = new caja_ahorro(nombre_cuenta);
				cliente_aux.agregar_cuenta(caja_aux);
				
			}
		}
		
	}

	
	public void listar_cuentas_cliente (double dni) {
		
		
		for (cliente cliente_aux : lista_clientes) {
			
			if (cliente_aux.getDni() == dni) {
				
				for (caja_ahorro cuenta : cliente_aux.getCuentas()) {
					
					System.out.print(cuenta.getNombre_cuenta());
					
				}
				
			}
			
			
		}
		
	}
	
	
}
