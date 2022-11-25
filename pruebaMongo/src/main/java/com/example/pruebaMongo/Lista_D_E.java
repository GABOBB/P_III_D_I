package com.example.pruebaMongo;

/**
 * Esta clase permite instanciar listas
 */

public class Lista_D_E {
    private String id;
    private Nodo_D_E head=null;
    private Nodo_D_E last=null;
    private int size=0;

    /**
     * Este método genera todos los nodos de uno de los mapas de centros de envío
     * @param id parámetro para identificar cada uno de los centros de envío
     * @param w representa el peso de cada una de las aristas entre los nodos que están conectados
     */
    public void addNode(int id, int w){
        Nodo_D_E newNode= new Nodo_D_E(id, w);
        if(head==null) head=newNode;
        else if(validation(id)){
            Nodo_D_E aux= this.head;
            while(aux.get_N()!=null){
                aux=aux.get_N();
            }
            size++;
            aux.set_N(newNode);
        }
    }

    /**
     * Se encarga de crear nodos
     * @param node
     */
    public void addNode(Nodo_D_E node){
        if(head==null) head=node;
        else{
            if(size==0) size++;
            Nodo_D_E aux=head;
            while(aux.get_N()!=null)
                aux=aux.get_N();
            aux.set_N(node);
            size++;
        }
    }

    /**
     * Este método se encarga de mostrar los pesos de cada una de las aristas
     */
    public void show(){
        Nodo_D_E aux= head;
        while(aux!=null){
            System.out.print(aux.getW()+ " ");
            aux=aux.get_N();
        }
    }

    /**
     * Método que permite mostrar el id de cada uno de los nodos
     */
    public void showId(){
        Nodo_D_E aux= head;
        while(aux!=null){
            System.out.print(aux.get_id()+ " ");
            aux=aux.get_N();
        }

    }

    /**
     * Revisa si el nodo no ha sido analizado a la hora de aplicar el algoritmo de recorrido Dijkstra.
     * @param id
     * @return
     */
    public boolean validation(int id){
        Nodo_D_E aux=head;
        while(aux!=null){
            if(aux.get_id()==id) return false;
            aux=aux.get_N();
        }
        return true;
    }

    /**
     * Obtienen el head de una lista
     * @return
     */
    public Nodo_D_E getHead(){return this.head;}

    /**
     * Da el tamaño de la lista
     * @return
     */
    public int getSize(){return size;}

}
