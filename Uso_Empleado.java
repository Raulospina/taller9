package tallerNueve;

public class Uso_Empleado {
public static void main(String[] args) {
	

	
	Empleado [] misEmpleados=new Empleado[4];
	misEmpleados [0]=new Empleado ("paco gomez", 85000,1990,12,17);
	misEmpleados [1]=new Empleado ("ana ", 95000,1995,06,02);
	misEmpleados [2]=new Empleado ("maria ", 105000,2002,03,15);
	misEmpleados [3]=new Empleado ("antonio");

	
	
	for (Empleado e: misEmpleados) {
	e.subeSueldo(5);
	
}
for (Empleado e: misEmpleados) {
	System.out.println("Nombre" +e.dameNombre()
	+"sueldo" + e.dameSueldo()
	+ "fecha de alta " + e.dameFechaContrato());
	
}
}


class Empleado {
	
	public Uso_Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();
	
	}
	
public Uso_Empleado (string nom) {
this.(nom,30000,200,01,01);
	
	
}
public String dameNombre() {
	return nombre;
}
public double dameSueldo() {
	return sueldo;
}

public date dameFechaContrato() {
	return altaContrato;
}
public void subeSueldo (double porcentaje ) {
	double aumento = sueldo*porcentaje/100;
}

}

}


