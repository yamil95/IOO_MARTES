package banco;

import java.util.Objects;

public class caja_ahorro {
	
	private float saldo;
	private String nombre_cuenta;
	
	public String getNombre_cuenta() {
		return nombre_cuenta;
	}

	public void setNombre_cuenta(String nombre_cuenta) {
		this.nombre_cuenta = nombre_cuenta;
	}

	public caja_ahorro(String nombre) {
		this.saldo = 0;
		this.nombre_cuenta = nombre;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre_cuenta);
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
		caja_ahorro other = (caja_ahorro) obj;
		return Objects.equals(nombre_cuenta, other.nombre_cuenta);
	}
	
	

}
