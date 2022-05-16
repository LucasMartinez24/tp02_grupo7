package ar.edu.unju.fi.tp02_grupo7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
  @GetMapping({"/Menu","/index","/","/home"})
  public String getMenu(){

    return "index";
  }
}
