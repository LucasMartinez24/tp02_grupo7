package ar.edu.unju.fi.tp02_grupo7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.numerosinvertidos;

@Controller
public class punto6_TP02Controller {
  @GetMapping("/punto_6")
  public String getpunto6(Model model){
    numerosinvertidos num = new numerosinvertidos();
    model.addAttribute("inv",num.Reverso());
    return "punto6_TP02";
  }
}
