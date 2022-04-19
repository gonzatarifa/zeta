package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;

public class Funciones {
		public static boolean esBisiesto(int anio) {
			return ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)));
		}

		public static boolean esfechavalidaV2(int anio,int mes , int dia) {
			boolean fechavalida=true;
		    
			switch (mes) {
			
			case 1:if(dia>31) fechavalida=false;break;
			case 2:if(dia>28 && !esBisiesto(anio))fechavalida=false;break;
			case 3:if(dia>31)fechavalida=false; break;
			case 4:if(dia>30)fechavalida=false; break;
			case 5:if(dia>31)fechavalida=false; break;
			case 6:if(dia>30)fechavalida=false; break;
			case 7:if(dia>31)fechavalida=false; break;
			case 8:if(dia>31)fechavalida=false; break;
			case 9:if(dia>30)fechavalida=false; break;
			case 10:if(dia>31)fechavalida=false; break;
			case 11:if(dia>30)fechavalida=false; break;
			case 12:if(dia>31)fechavalida=false; break;
			default :fechavalida=false;
			}
			return fechavalida;
		}
		
		public static boolean esFechaValida(LocalDate fecha) {
			int anio = fecha.getYear();
			if (esBisiesto(anio)) {
				return true;
			} else {
				return false;
			}
		}
		
		public static String traerFechaCorta(LocalDate fecha) {
			return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
		}
		
		public static String traerHoraCorta(LocalTime hora) {
			return hora.getHour() + ":" + hora.getMinute();
		}
		
		public static boolean esDiaHabil(LocalDate fecha){
			int dia = fecha.getDayOfWeek().getValue();
			return (( dia >=1) &&( dia <=5));
		}
		
		public static String traerDiaDeLaSemana(LocalDate fecha) {
			int dia = fecha.getDayOfWeek().getValue();
			String diaNombre[] = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
			return diaNombre[dia-1];
		}
		
		public static String traerMesEnLetras(LocalDate fecha) {
			int mes = fecha.getMonthValue();
			String mesNombre[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
			return mesNombre[mes-1];
		}
		
		public static String traerFechaLarga(LocalDate fecha) {
			return traerDiaDeLaSemana(fecha) + " " + fecha.getDayOfMonth() + " de " + traerMesEnLetras(fecha) + " del "
					+ fecha.getYear();
		}
		
		public static int traerCantDiasDeUnMes(int anio, int mes) {
			return YearMonth.of(anio,mes).lengthOfMonth();
		}
		
		public static double aproximar2Decimal(double valor) {
			return Math.round(valor * 100d) / 100d;
		}
		
		public static boolean esNumero(char c) {
			return Character.isDigit(c);
		}
		
		public static boolean esLetra(char c) {
			return Character.isLetter(c);
		}
		
		public static boolean esCadenaNros(String cadena) {
			return (cadena.matches("[0-9]+"));
		}

		public static boolean esCadenaLetras(String cadena) {
			return (cadena.matches("[a-zA-Z]+"));

		}
}
