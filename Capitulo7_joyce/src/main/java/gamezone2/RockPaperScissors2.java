/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.Scanner;

/**
 *
 * @author ARCHV
 */
public class RockPaperScissors2 {
    Scanner sc = new Scanner(System.in);
    private Integer optionUser;
    private Integer optionPc;

    public void recorrer(){
        for (int i = 0; i < 10; i++) {
            play();
        }
    }
    public void play(){
        System.out.println("[1]Piedra [2]Papel [3]Tijeras ");
        setOptionPc();
        optionUser = sc.nextInt();
        System.out.println(getOptionPc());
        if (optionUser == optionPc) {
            System.out.println("Empate");
        }else if ((optionUser ==1&& optionPc==3)||(optionUser ==2&& optionPc==1)||(optionUser ==3&& optionPc==2)) {
            System.out.println("Ganaste"); 
        }else if ((optionUser ==1&& optionPc==2)||(optionUser ==2&& optionPc==3)||(optionUser ==3&& optionPc==1)) {
            System.out.println("Perdiste");
        }
    }
    public Integer getOptionUser() {
        return optionUser;
    }

    public void setOptionUser(Integer optionUser) {
        this.optionUser = optionUser;
    }

    public Integer getOptionPc() {
        return optionPc;
    }

    public void setOptionPc() {
        this.optionPc = (int) (Math.random() * 3 + 1);
    }
      
}
