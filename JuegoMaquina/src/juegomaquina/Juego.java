/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegomaquina;

import javax.swing.JOptionPane;

/**
 *
 * @author sherlyn
 */
public class Juego {
    
    public Juego (){
        
    }
    
    public void hacerJuego (){
         double numR = Math.floor(Math.random()*(1-50+1)+50);
//         Se a distancia entre o número a adivinar e o tecleado é maior de 20  “ moi lonxe “
//Entre 10 e 20 , ambos incluidos,  lonxe
//Maior de 10 e menor de 5  preto
//Menor ou igual de 5  moi preto .   

            String intentos = JOptionPane.showInputDialog("¿En cuántos intentos quieres adivinar el número?");
            int numIntentos = Integer.parseInt(intentos); 
            juego:
            for (int contador=0; contador<=numIntentos; contador++){
                String respuesta = JOptionPane.showInputDialog("Teclea un número entre 1 y 50");
                double numU = Integer.parseInt(respuesta);
                double resul;
                if (numU>numR){
                   resul = numU - numR;
                }
                else {
                    resul = numR - numU;
                }
                
                if (numU==numR){
                    int respuesta2 = JOptionPane.showConfirmDialog(null, "¡Enhorabuena "+numU+" es el número correcto!"
                    + "\n¿Deseas continuar jugando?");
                    if(respuesta2 == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "¡Genial, pues empezemos!");
                    Juego.this.empezarJuego();
                    }
                    else if(respuesta2 == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "¡Hasta otra entonces!");
                    break juego;
                    }
                }
                
                if (resul > 20){
                JOptionPane.showMessageDialog(null, "Estás muy lejos del número"); 
                }
                else if (resul >=10 && resul<=20){
                JOptionPane.showMessageDialog(null, "Estás lejos del número");
                } 
                else if (resul <=10 && resul >=5){
                JOptionPane.showMessageDialog(null, "Estás cerca del número"); 
                }
                else {
                JOptionPane.showMessageDialog(null, "Estás muy cerca del número");    
                }
               
            } 
            int respuesta4 = JOptionPane.showConfirmDialog(null, "Lo siento superaste el número de intentos"
                    + "\n¿Deseas continuar intentándolo?");
                
                juego2:
                if(respuesta4 == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "¡Buena suerte esta vez!");
                    Juego.this.empezarJuego();
                }
                else if(respuesta4 == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "¡Hasta otra!");
                break juego2;
                }
                
        } //final del método
    
     public void empezarJuego(){
        Juego.this.hacerJuego();
    }
    
} //final de la clase
        
   
    
