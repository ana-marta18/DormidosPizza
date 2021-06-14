/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormidospizza;

import java.util.ArrayList;

/**
 *
 * @author Ana Marta
 */
public class DormidosPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Pizzas> Listado2 = new ArrayList<Pizzas>();
        ArrayList<Ordenes> Listado = new ArrayList<Ordenes>();
        // TODO code application logic here
       index  p = new index(Listado2,Listado);
       p.setVisible(true);
    }
    
}
