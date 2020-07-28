/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristianponcemicroproyecto;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class CristianPonceMicroProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        int cuotaF,año;
        
        String[] altaG = {"BMW", "AUDI","PORSCHE","VOLVO","ROLLS-ROYCE","FERRARI"};
        
        marca = JOptionPane.showInputDialog(null, "Cual es la marca de su auto? ","A.Segura2",JOptionPane.QUESTION_MESSAGE);
        marca = marca.toUpperCase();
        año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar año de su auto", "A.Segura2",JOptionPane.INFORMATION_MESSAGE));
        
        boolean Gama = buscadorG (altaG,marca);
        if (Gama){
        cuotaF = 1800;
        }else{
        cuotaF = 890;
        }
        
        int cuota = buscadorA (año);
        cuotaF = cuotaF + cuota; 
        
       //JOptionPane.showMessageDialog(null, "El valor de la cuota es " + cuotaF + "para su " + marca + "modelo " + año ); 
       JOptionPane.showMessageDialog(null, "Su auto " + marca + "\nModelo " + año + "\nTiene un valor de cuota de $ " + cuotaF);
    }
    
    public static boolean buscadorG (String [] altaG, String marca){
    //Foreach
        for(String marcaF : altaG){
            if(marcaF.equals(marca)){
                return true;
            }
        }
        return false;
    }
    
    public static int buscadorA (int año){
        int cuota =0;
        if(año <= 1990){
        cuota = 350;
        }
        if(año >= 1990 && año <= 1999 ){
        cuota = 480;
        } 
        if (año >= 2000 && año <= 2010 ){
        cuota = 780;
        }
        if (año >= 2011 && año <= 2016 ){
        cuota = 950;
        }
        if (año >= 2017 && año <= 2020 ){
        cuota = 1200;
        }
        return cuota;
    }
}
