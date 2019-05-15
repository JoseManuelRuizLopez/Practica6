package practica6;

/** 
 * Clase Coche en donde se definen los atributos de Coche y son implementados los métodos combustible, cocheMasMatricula, 
 * metodoGasolina, metodoDiesel, metodoHibrido.
 *
 *@version 2019
 * @author José Manuel Ruiz López
 */
public class Coche 
{
	private static final String EL_COCHE_CON_MATRICULA = "El coche con matrícula ";
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
	 * @return El resultado es la información del coche según el tipo de combustible.
	 */
	public String combustible() 
	{
		String resultado = "";

		switch(combustible) 
		{
		case"Gasolina":
			resultado += cocheMasMatricula() + metodoGasolina(modelo, fabricante);
			break;

		case"Diésel":
			resultado += cocheMasMatricula() + metodoDiesel(modelo, fabricante);
			break;

		case"Híbrido":
			resultado += cocheMasMatricula() + metodoHibrido(modelo, fabricante);
			break;

		default:
			resultado += cocheMasMatricula() + " no dispone de información";
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
	 * @return Devuelve un String con el modelo y fabricante con el consumo euros por litros de la gasolína.
	 */
	public String metodoGasolina(String modeloCoche, String fabricanteCoche)
	{
		return "Es un " + fabricanteCoche + modeloCoche + " y gasta 1,337 euros por litro.";
	}

	/**
	 * @param modeloCoche Atributo que es el modelo de coche.
	 * @param fabricanteCoche Atributo que es el fabricante del coche.
	 * @return Devuelve un String con el modelo y fabricante con el consumo euros por litros de el Diésel.
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
