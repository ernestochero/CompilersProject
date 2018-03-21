package main;

import java.util.HashMap;


/**
 *
 * @author Informatico40
 */
public class TablaSimbolos {
    HashMap t;
    
    public TablaSimbolos(){
        t = new HashMap();
    }
    
    public Simbolo insertar(String nombre){
        Simbolo simbolo = new Simbolo(nombre, new Integer(0));
        t.put(nombre, simbolo);
        return simbolo;
    }
    
    public Simbolo buscar(String nombre){
        return (Simbolo)t.get(nombre);
    }
    
    public void imprimir(){
        /*
        Iterator it = t.values().iterator();
        while(it.hasNext()){
            Simbolo s = (Simbolo)it.next();
            System.out.println(s.nombre + ": "+ s.valor);
        }
        */    
    }
    
}