package ar.edu.unju.fi.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProgresoFecha {
  private LocalDate fecha1;
  private LocalDate fecha2;
  private LocalTime time1;
  private LocalTime time2;
  private LocalDateTime dateTime1;
  private LocalDateTime dateTime2; 
 
  public ProgresoFecha() {
  }
  public ProgresoFecha(LocalDate fecha1, LocalDate fecha2) {
    this.fecha1 = fecha1;
    this.fecha2 = fecha2;
  }
  public ProgresoFecha(LocalTime time1, LocalTime time2) {
    this.time1 = time1;
    this.time2 = time2;
  }
  public ProgresoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
    this.dateTime1 = dateTime1;
    this.dateTime2 = dateTime2;
  }
  public void setFecha1(LocalDate fecha1) {
    this.fecha1 = fecha1;
  }
  public LocalDate getFecha1() {
    return fecha1;
  }
  public void setFecha2(LocalDate fecha2) {
    this.fecha2 = fecha2;
  }
  public LocalDate getFecha2() {
    return fecha2;
  }
  public void setTime1(LocalTime time1) {
    this.time1 = time1;
  }
  public LocalTime getTime1() {
    return time1;
  }
  public void setTime2(LocalTime time2) {
    this.time2 = time2;
  }
  public LocalTime getTime2() {
    return time2;
  }
  public void setDateTime1(LocalDateTime dateTime1) {
    this.dateTime1 = dateTime1;
  }
  public LocalDateTime getDateTime1() {
    return dateTime1;
  }
  public void setDateTime2(LocalDateTime dateTime2) {
    this.dateTime2 = dateTime2;
  }
  public LocalDateTime getDateTime2() {
    return dateTime2;
  }
  
  public Period contarTiempoTranscurrido(){
    Period periodo = Period.between(this.fecha1,this.fecha2);
    return periodo;
  }

  public String formatearFecha(LocalDate fecha){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formato = fecha.format(formatter);
    return formato;
  }

  public String compararFechas(){
    String fecha1= formatearFecha(this.fecha1),fecha2= formatearFecha(this.fecha2),mensaje;
    if(fecha1.compareTo(fecha2) > 0){
      mensaje="La fecha1 es anterior a fecha2";
    }else{
      if(fecha1.compareTo(fecha2) < 0){
        mensaje="La fecha fecha1 es posterior a la fecha fecha2";
      }else{
        mensaje="Las fechas son iguales";
      }
    }
    return mensaje;
  }
}
