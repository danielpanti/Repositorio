/*
Parte 2
 */
package arbol;

/**
 *
 * @author lcastro
 */
public class Arbolbinario {
    Nodo raiz;
    Nodo auxiliar;
    Nodo padre;
    
    //Arbol vacío
    public Arbolbinario(){
        raiz = null;
    }

    //Insertar nodo al árbol
    public void InsertarNodo(int Num, Object Nom){
        
        Nodo nuevo=new Nodo(Num,Nom);
        if (raiz==null)
            raiz=nuevo;
        else{
            auxiliar=raiz;
            while (true){
                    
                    padre=auxiliar;
                    if (Num<auxiliar.Numero){
                        auxiliar=auxiliar.hijoIzq;
                        if (auxiliar==null){
                            padre.hijoIzq=nuevo;
                            return;
                        }
                    }
                    else{
                        auxiliar=auxiliar.hijoDer;
                        if (auxiliar==null){
                            padre.hijoDer=nuevo;
                            return;
                        }
                    }
                    }
                }
        }
    
   public void RInorder(Nodo n){
       if (n!=null){
           RInorder(n.hijoIzq);
           System.out.println("Numero " + n.Numero + ",Nombre "+ n.Nombre);
           RInorder(n.hijoDer);
       }
   }
}