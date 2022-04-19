package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Empleado> lstEmpleados = new ArrayList<Empleado>();
	private List<Tarea> lstTareas = new ArrayList<Tarea>() ;
	
	public Sistema() {}

	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	public void setLstEmpleados(List<Empleado> lstEmpleados) {
		this.lstEmpleados = lstEmpleados;
	}

	public List<Tarea> getLstTareas() {
		return lstTareas;
	}

	public void setLstTareas(List<Tarea> lstTareas) {
		this.lstTareas = lstTareas;
	}

	@Override
	public String toString() {
		return "Sistema [lstEmpleados=" + lstEmpleados + ", lstTareas=" + lstTareas + "]";
	}
	
	public Empleado traerEmpleado(String nroLegajo) {
		Empleado aux = null;
		int i=0;
		while (aux==null&&i<this.lstEmpleados.size()) {
			if (lstEmpleados.get(i).getNroLegajo().equals(nroLegajo)) {
				aux= lstEmpleados.get(i);
			}
			i++;
		}
		return aux;
	}
	
	public Tarea traerTarea(int id) {
		Tarea aux = null;
		int i=0;
		while (aux==null&&i<this.lstTareas.size()) {
			if (lstTareas.get(i).getIdTarea() == id) {
				aux = lstTareas.get(i);
			}
			i++;
		}
		return aux;
	}
	
	public boolean agregarEmpleado(String apellido, String nombre, String nroLegajo, double valorHora) {
		return lstEmpleados.add(new Empleado(apellido, nombre, nroLegajo , valorHora));
	}
	
	public boolean agregarTarea(String tarea, LocalDate fechaInicio, LocalDate fechaFin, Empleado
			responsable, int cantHorasDiarias, boolean habil) {
		Tarea aux = null;
		if (lstTareas.isEmpty()) {
			aux = new Tarea(1,tarea,fechaInicio ,fechaFin ,responsable,cantHorasDiarias,habil);
		} else {
			aux = new Tarea(lstTareas.get(lstTareas.size() - 1).getIdTarea()+ 1,tarea,fechaInicio ,fechaFin ,responsable,cantHorasDiarias,habil );
		}
		return lstTareas.add(aux);
	}
}
