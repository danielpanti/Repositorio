/*
Parte 3
 */
package arbol;

/**
 *
 * @author lcastro
 */
public class Arbol {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Arbolbinario arbol = new Arbolbinario();
      arbol.InsertarNodo(4, "Amarillo");
      arbol.InsertarNodo(8, "Naranja");
      arbol.InsertarNodo(1, "Rojo");
      arbol.InsertarNodo(9, "Rosado");
      arbol.InsertarNodo(7, "Verde");
    
      arbol.RInorder(arbol.raiz);
    }
   
}
