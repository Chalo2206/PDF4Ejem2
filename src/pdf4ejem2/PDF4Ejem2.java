package pdf4ejem2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gonzalo
 */
public class PDF4Ejem2 {

    public static void main(String[] args) {
        List lista1 = new LinkedList();
        lista1.add("madrid");
        lista1.add("Sevilla");
        lista1.add("Valencia");
        Iterator iterador = lista1.iterator();
        //Recordemos y mostramos la lista
        while (iterador.hasNext()){
            String elemento = (String) iterador.next();
            System.out.print(elemento + " ");
        }
        System.out.println("--LinkeList--");
        //ArrayList
        List lista2 = new ArrayList();
        
        /// Añadimos nodos y creamos un Iterator 
        lista2.add("Madrid"); lista2.add("Sevilla"); 
        lista2.add("Valencia"); 
        Iterator iterador2 = lista2.iterator();
        
        // Recorremos y mostramos la lista 
        while (iterador2.hasNext()) { 
            String elemento = (String) iterador2.next(); 
            System.out.print(elemento + " "); 
        }
        System.out.println("--ArrayList--");
    }
    
}
