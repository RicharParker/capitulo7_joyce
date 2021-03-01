/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

/**
 *
 * @author ARCHV
 */
public class Eliza {
    private String respuesta;
    private String frase;

    public Eliza(String frase) {
        this.frase = frase;
    }
    
    public void entrevista(){
        do {
            if (!getFrase().equalsIgnoreCase("adios")) {
                if (getFrase().contains("mi")) {
                    System.out.println("Dime mas acerca de eso");
                }else if ((getFrase().contains("amor"))|| getFrase().contains("odio")) {
                    System.out.println("Todo parace indicar que tienes sentiminetos acerca de eso ");
                }else{
                    System.out.println("Continua , Dime mas acerca d eso");
                }
            }
        } while (getFrase().contains("Adios"));
        
    }
    
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
}
