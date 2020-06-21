package com.estefany.holamundo.holamundo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.estefany.holamundo.Model.persona;


@Controller
public class controlador {

	@GetMapping("/")
	public String Inico(Model modelo) {
		persona p = new persona();
		p.setNombre("Estefany");
		p.setApellido("Guardado");
		p.setTelefono("7883-8908");
		p.setEmail("stephaniaguilar50@gmail.com");
		
		persona p2 = new persona();
		p2.setNombre("Alex");
		p2.setApellido("Polanco");
		p2.setTelefono("7234-2647");
		p2.setEmail("alexander34@gmail.com");
		
		List personass = (List) Arrays.asList(p,p2);
		
		
		String mensaje = "HOLA DESDE EL CONTROLADOR";
		modelo.addAttribute("saludo",mensaje);
		//modelo.addAttribute("person",p);
		modelo.addAttribute("person",personass);
		
		return "index";
	}
}
