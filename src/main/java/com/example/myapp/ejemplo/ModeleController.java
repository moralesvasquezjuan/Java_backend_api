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
@RequestMapping("/Persona")
public List<Persona>getPersona(){
	List<Persona>Personas=new Arraylist<Persona>();
	return Personas;
}
}
