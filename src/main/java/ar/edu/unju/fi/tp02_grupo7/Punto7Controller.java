package ar.edu.unju.fi.tp02_grupo7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.Frutas;

@Controller
public class Punto7Controller {
  @GetMapping("/punto_7")
  public String getpunto6(Model model){
    Frutas frut = new Frutas();
    model.addAttribute("par",frut.par());
    frut.setI(4);
    model.addAttribute("borrar", frut.borrar());
    model.addAttribute("cantidad",frut.cantidad());
    return "Punto7_TP02";
  }
}
