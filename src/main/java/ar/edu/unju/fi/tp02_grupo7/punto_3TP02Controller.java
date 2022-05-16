package ar.edu.unju.fi.tp02_grupo7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.punto3_TP02;

@Controller 
public class punto_3TP02Controller {
@GetMapping("/punto_3")
public String punto_3(Model model) {
	punto3_TP02 p3 =new punto3_TP02();
	p3.setNombre("Sebastian");
	p3.setApellido("Diaz");
	p3.setLibreta(777);
	 model.addAttribute("Nombre", p3.getNombre());
	 model.addAttribute("Apellido", p3.getApellido());
	 model.addAttribute("Libreta", p3.getLibreta());
	 model.addAttribute("Promedio", p3.calcularPromedio());
	 model.addAttribute("Maxima", p3.obtenerNotaMaxima());
	return "punto3_TP02";
}
}
