package banco;

public class main_banco {

	public static void main(String[] args) {
		
		
		banco_ioo banco_1 = new banco_ioo ();
		
		banco_1.crear_cliente("armas", 123456, "4234-1234");
		banco_1.agregar_cuenta_cliente(1234567,"sueldo");

	}

}
