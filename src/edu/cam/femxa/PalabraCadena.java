package edu.cam.femxa;

public class PalabraCadena {

	
	
	//HACED UN M�TODO QUE DADA UNA CADENA, MUESTRE CADA UNA DE LAS LETRAS CON UN BUCLE FOR

	/**
	 * Dada una cadena, muestra cada una de las letras con un bucle for
	 * @param palabra Cadena a mostrar
	 */
	
	public void mostrarLetrasFor (String palabra)
	{
		int longi = palabra.length();
		char letra = 0;
		
		for (int index = 0; index < longi; index ++)
		{
			letra = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra);
		}
	}
	
	
	//HACED UN M�TODO QUE DADA UNA CADENA Y UN N�MERO N, MUESTRE LOS N PRIMEROS N�MEROS DE LA CADENA
	
	/**
	 * Dada una cadena y un n�mero N, muestra los N primeros n�meros de la cadena
	 * @param palabra Cadena a mostrar
	 * @param n N�mero de caracteres a mostrar de la cadena
	 */
	
	public void mostrarLetrasHastaN (String palabra, int n)
	{
		int index = 0;
		char letra = 0;
		int longi = palabra.length();
		
		if (n < longi)
		{
			while (index < n) 
			{
				letra = palabra.charAt(index);
				System.out.println("Letra " + index + " = "+ letra);
				index ++;
			}
		}
			else
			{
				System.out.println("El n�mero de letras de la cadena es inferior al n�mero dado");
			}
		
	}
	
	
	//HACED UN M�TODO QUE DADA UNA CADENA Y UN N�MERO N, MUESTRE LOS N �LTIMOS N�MEROS DE LA CADENA
	
	
	public void mostrarUltimasNLetras ()
	{
		//TODO
	}
	
	

	//HACED UN M�TODO QUE DADA UNA CADENA Y UNA LETRA, DEVUELVA EL N�MERO DE VECES QUE APARECE ESA LETRA EN ESA PALABRA
	 
	public void mostrarNVecesLetra ()
	{
		//TODO
	}
	
	
	/**
	 * Muestra las letras de la palabra hasta encontrar la letra dada.
	 * @param Palabra palabra a mostrar.
	 * @param letra_encontrada Letra a encontrar en la palabra.
	 */
	
	public void mostrarLetrasPalabraHastaEncontrarLetra (String palabra, char letra_encontrada)
	{
		boolean b_letra_encontrada = false;
		int index = 0;
		int longi = palabra.length();
		char letra_mostrada = 0;
		
		
		while ((index < longi) && (!b_letra_encontrada))
		{
			letra_mostrada = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra_mostrada);
			index = index + 1;
			if (letra_encontrada == letra_mostrada)
			{
				b_letra_encontrada = true;
			}
		}
		
		
	}
	
	public void mostrarLetrasPalabra (String palabra)
	{
		int index = 0;
		int longi = palabra.length();
		char letra = 0; //la letra es un n�mero en el fondo, recuerda
		
		while (index < longi)
		{
			letra = palabra.charAt(index);
			System.out.println("Letra " + index + " = "+ letra);
			index = index + 1;
		}
		
	}
	

}
