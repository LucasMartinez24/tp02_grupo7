package ar.edu.unju.fi.tp02_grupo7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.fi.model.punto15_TP01;

@Controller
public class punto15_TP01Controller {
  @GetMapping("/punto15")
  public String punto_15(@RequestParam ("anio") String anio,@RequestParam ("nombre") String nombre,Model model){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate aux2=LocalDate.parse(anio,formatter);
		punto15_TP01 aux = new punto15_TP01();
		aux.setNombre(nombre);
		aux.setFechanac(aux2);
    model.addAttribute("nombre", nombre);
    model.addAttribute("edad", aux.anio());
    model.addAttribute("Signo",aux.Horoscopo());
    model.addAttribute("estacion",aux.Estacion());
    return "punto15_TP01";
  }
  
}
