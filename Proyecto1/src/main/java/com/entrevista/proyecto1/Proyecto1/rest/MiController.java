package com.entrevista.proyecto1.Proyecto1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
@RestController
public class MiController {
	
	/**
	 * 
	 * @param palabra
	 * @return
	 */
	@GetMapping("/validar-palindromo/{palabra}")
	public String Palindromo(@PathVariable String palabra) {
		return esPalindromo(palabra) ? "La palabra " + palabra + " es un palíndromo" : "La palabra " + palabra + " no es un palíndromo";
	}
	
	public Boolean esPalindromo(String palabra) {
		for(int i = 0; i < palabra.length()/2; i++) {
			if(palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)) {
				return Boolean.FALSE;
			}
		}
		
		return Boolean.TRUE;
	}
}
