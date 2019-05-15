package practica6;

/** 
 * Clase Coche en donde se definen los atributos de Coche y son implementados los m�todos combustible, cocheMasMatricula, 
 * metodoGasolina, metodoDiesel, metodoHibrido.
 *
 *@version 2019
 * @author Jos� Manuel Ruiz L�pez
 */
public class Coche 
{
	private static final String EL_COCHE_CON_MATRICULA = "El coche con matr�cula ";
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche()
	{
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f)
	{
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	/**
	 * @return El resultado es la informaci�n del coche seg�n el tipo de combustible.
	 */
	public String combustible() 
	{
		String resultado = "";

		switch(combustible) 
		{
		case"Gasolina":
			resultado += cocheMasMatricula() + metodoGasolina(modelo, fabricante);
			break;

		case"Di�sel":
			resultado += cocheMasMatricula() + metodoDiesel(modelo, fabricante);
			break;

		case"H�brido":
			resultado += cocheMasMatricula() + metodoHibrido(modelo, fabricante);
			break;

		default:
			resultado += cocheMasMatricula() + " no dispone de informaci�n";
		}

		return resultado;
	}

	/**
	 * @return Devuelve un String con la cadena mas la matricula del coche.
	 */
	public String cocheMasMatricula()
	{
		return EL_COCHE_CON_MATRICULA + matricula + " ";
	}
	
	/**
	 * @param modeloCoche Atributo que es el modelo de coche.
	 * @param fabricanteCoche Atributo que es el fabricante del coche.
	 * @return Devuelve un String con el modelo y fabricante con el consumo euros por litros de la gasol�na.
	 */
	public String metodoGasolina(String modeloCoche, String fabricanteCoche)
	{
		return "Es un " + fabricanteCoche + modeloCoche + " y gasta 1,337 euros por litro.";
	}

	/**
	 * @param modeloCoche Atributo que es el modelo de coche.
	 * @param fabricanteCoche Atributo que es el fabricante del coche.
	 * @return Devuelve un String con el modelo y fabricante con el consumo euros por litros de el Di�sel.
	 */
	public String metodoDiesel(String modeloCoche, String fabricanteCoche)
	{
		return "Es un " + fabricanteCoche + modeloCoche + " y gasta 1,052 euros por litro.";
	}

	/**
	 * @param modeloCoche Atributo que es el modelo de coche.
	 * @param fabricanteCoche Atributo que es el fabricante del coche.
	 * @return Devuelve un String con el modelo y fabricante explicando que no necesita combustible.
	 */
	public String metodoHibrido(String modeloCoche, String fabricanteCoche)
	{
		return "Es un " + fabricanteCoche + modeloCoche +  " y no necesita combustible.";
	}
}
