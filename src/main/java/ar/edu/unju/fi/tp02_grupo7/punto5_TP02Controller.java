package ar.edu.unju.fi.tp02_grupo7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.CadenaReverso;

@Controller
public class punto5_TP02Controller {
  @GetMapping("/punto_5")
  public String getPunto(Model model){
    CadenaReverso revers = new CadenaReverso();
    revers.setAux("Hola mundo!");
    model.addAttribute("cadena", revers.getAux());
    model.addAttribute("invertida",revers.Reverso());
    return "Punto5_TP02";
  }
}
