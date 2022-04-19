package test;

import java.time.LocalDate;

import modelo.Empleado;
import modelo.Sistema;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema = new Sistema();
		
		System.out.println("1");
		sistema.agregarEmpleado("Carrizo","Luis","2434",380.0);
		sistema.agregarEmpleado("Ruiz","Lucia","2732",470.0);

		System.out.println("2");
		System.out.println(sistema.traerEmpleado("2732"));
		
		System.out.println("3");
		sistema.agregarTarea("Reparación San Martin altura 400-500",LocalDate.of(2021, 5, 14),LocalDate.of(2021, 6, 14),sistema.traerEmpleado("2732"), 4, true);
		sistema.agregarTarea("Reparación semaforo peatonal Maipu y Alsina",LocalDate.of(2021, 6, 18),LocalDate.of(2021, 7, 14), sistema.traerEmpleado("2434"), 4, false);
		
		System.out.println("4");
		System.out.println(sistema.traerTarea(1));
		
		System.out.println("5");
		System.out.println(sistema.traerTarea(1).calcularJornal());
		
		System.out.println("6");
		System.out.println(sistema.traerTarea(1).calcularCantDiasTrabajados(6, 2021));
		
		System.out.println("7");
		System.out.println(sistema.traerTarea(1).calcularHonorarios(6, 2021));
		
		System.out.println("8");
		System.out.println(sistema.traerTarea(2));
		
		System.out.println("9");
		System.out.println(sistema.traerTarea(2).calcularJornal());
		
		System.out.println("10");
		System.out.println(sistema.traerTarea(2).calcularCantDiasTrabajados(6, 2021));
		
		System.out.println("11");
		System.out.println(sistema.traerTarea(2).calcularHonorarios(6, 2021));
		
		System.out.println("hola como estas");
	}

}
