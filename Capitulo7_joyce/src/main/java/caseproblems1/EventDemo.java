
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblems1;


/**
 *
 * @author ARCHV
 */
public class EventDemo {
    private final static Integer precioxInvitado = 30;
    private final static Integer grandEvent = 50;
    private String evento;
    private Integer nInvitados;
    private Integer Costo;
    private String nTelefono;
    

      public EventDemo(String evento, Integer nInvitados) {
        this.evento = evento;
        this.nInvitados = nInvitados;
        this.Costo = nInvitados * precioxInvitado ;
    }
    
    public void invitar(){
        for (int i = 0; i < this.nInvitados; i++) {
            System.out.println("Please come to my event");
        }
    }

    public String getnTelefono() {
        
        return nTelefono;
    }

    public void setnTelefono(String numero) {
        numero = numero.replace('(', '\0');
        numero = numero.replace(')', '\0');
        numero = numero.replace('-', '\0');
        numero = numero.replace(' ', '\0');
        numero = numero.replaceAll("\0", "");
        if (numero.length()!=10) {
            numero = "0000000000";
        }
        this.nTelefono = numero;
        
    }
    
    
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Integer getnInvitados() {
        return nInvitados;
    }

    public void setnInvitados(Integer nInvitados) {
        
     while (this.nInvitados > 100 || this.nInvitados <5){
          this.Costo = nInvitados * precioxInvitado;
      }
    }

    public Integer getCosto() {
        return Costo  ;
    }

    public void setCosto(Integer Costo) {
        this.Costo = Costo;
    }
}
