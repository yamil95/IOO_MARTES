package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class cliente {
	
	private String nombre ;
	private double dni;
	private String telefono;
	private List<caja_ahorro> cuentas = new ArrayList <caja_ahorro>();
	
	public cliente(String nombre, double dni, String telefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		
	}
	
	public void agregar_cuenta (caja_ahorro cuenta) {
		
		
		if (!cuentas.contains(cuenta)) {
			
				cuentas.add(cuenta);
		}
	
		
	}
	
	

	public List<caja_ahorro> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<caja_ahorro> cuentas) {
		this.cuentas = cuentas;
	}

	public double getDni() {
		return dni;
	}

	public void setDni(double dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		cliente other = (cliente) obj;
		return Double.doubleToLongBits(dni) == Double.doubleToLongBits(other.dni);
	}
	
	

}
