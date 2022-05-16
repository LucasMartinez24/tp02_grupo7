package ar.edu.unju.fi.tp02_grupo7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.ProgresoFecha;

@Controller
public class Punto17_TP01Controller {
  @GetMapping("/punto17")
  public String getpunto17(Model model){
    ProgresoFecha pf1 =new ProgresoFecha();
    pf1.setFecha1(LocalDate.now());
    pf1.setFecha2(LocalDate.of(2002, 8, 21));
    model.addAttribute("fecha1", pf1.getFecha1());
    model.addAttribute("fecha2", pf1.getFecha2());
    ProgresoFecha pf2 =new ProgresoFecha();
    pf2.setTime1(LocalTime.of(15, 45, 50));
    pf2.setTime2(LocalTime.now());
    LocalTime aux=pf2.getTime1(),aux2=pf2.getTime2();
    model.addAttribute("time1", aux.plusHours(5));
    model.addAttribute("time2", aux2.minusMinutes(20));
    model.addAttribute("comparar", pf1.compararFechas());
    ProgresoFecha pf3 = new ProgresoFecha();
    pf3.setDateTime1(LocalDateTime.of(pf1.getFecha1(), pf2.getTime1()));
    pf3.setDateTime2(LocalDateTime.of(pf1.getFecha2(), pf2.getTime2()));
    model.addAttribute("datetime", pf3.getDateTime1());
    model.addAttribute("datetime2", pf3.getDateTime2());
    ProgresoFecha pf4 = new ProgresoFecha();
    pf4.setFecha1(LocalDate.of(2003, 4, 8));
    pf4.setFecha2(LocalDate.now());
    String aux3= pf4.formatearFecha(pf4.getFecha1());
    String aux4= pf4.formatearFecha(pf4.getFecha2());
    Period edad = pf4.contarTiempoTranscurrido();
    String edad2=String.format("Han transcurrido %d años, %d meses y %d días desde la fecha " + aux3 + " hasta la fecha " + aux4,
    edad.getYears(),
    edad.getMonths(),
    edad.getDays());
    model.addAttribute("edad", edad2);
    String aux5="15/05/2022";
    ProgresoFecha pf5 = new ProgresoFecha();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    pf5.setFecha1(LocalDate.parse(aux5,formatter));
    System.out.println(pf5.getFecha1());
    model.addAttribute("anio", pf5.getFecha1().plusDays(365));
    String aux6="23/08/1816";
    pf5.setFecha2(LocalDate.parse(aux6,formatter));
    model.addAttribute("meses", pf5.getFecha2().plusMonths(6));
    return "punto17_TP01";
  }
}
