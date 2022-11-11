package com.example.myapp.ejemplo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ModeleController {
	@GetMapping("/saludo")
	public String saludo(){
		return "<h1>Hola Mundo STS</h1>";	
	}
	@RequestMapping("/persona")
	public List <Personas>getPersona(){
		List<Personas>personas=new ArrayList<Personas>();
		Personas p1=new Personas();
		p1.setId(1);
		p1.setNombre("Juan");
		p1.setApellido("Pérez");
		p1.setTelefono("12345678");
		personas.add(p1);
		
		Personas p2=new Personas();
		p2.setId(2);
		p2.setNombre("Jhon");
		p2.setApellido("Constantin");
		p2.setTelefono("123456789");
		personas.add(p2);
		return personas;
	}
}

