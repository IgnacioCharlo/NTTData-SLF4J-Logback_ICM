package com.nttdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	private final static Logger LOG = LoggerFactory.getLogger(App.class);
	
	/**
	 * Metodo principal del programa
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

	/**
	 * Inicio
	 */

		LOG.info("INICIO");

	/**
	 * Array por defecto
	 */

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		LOG.debug("Array {}", arr);

		invertirArray(arr);
		
		LOG.debug("El resultado es: {}", arr);

		LOG.info("FINAL");
		
		/**
		 * Fin
		 */

	}

	/**
	 * Insertar el valor en una posicu¡ion de un array
	 * 
	 * @param args
	 */

	public static int[] invertirArray(int[] arr) {
		
		int[] res = new int[arr.length];
		
		for(int i = arr.length-1, j = 0; i >= 0; i--, j++) {
			res[j] = arr[i];
			LOG.debug("Res = {}, Arr = {}", res, arr);
		}
		
		LOG.debug("El resultado es: {}", res);
		
		return res;
		
	}

}

