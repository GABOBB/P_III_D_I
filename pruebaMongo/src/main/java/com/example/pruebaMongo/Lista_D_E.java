package com.example.pruebaMongo;

/**
 * authon: B.B.G.
 */

public class Lista_D_E {
    private String id;
    private Nodo_D_E head=null;
    private Nodo_D_E last=null;
    private int size=0;

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
    public void show(){
        Nodo_D_E aux= head;
        while(aux!=null){
            System.out.print(aux.getW()+ " ");
            aux=aux.get_N();
        }
    }
    public void showId(){
        Nodo_D_E aux= head;
        while(aux!=null){
            System.out.print(aux.get_id()+ " ");
            aux=aux.get_N();
        }

    }
    public boolean validation(int id){
        Nodo_D_E aux=head;
        while(aux!=null){
            if(aux.get_id()==id) return false;
            aux=aux.get_N();
        }
        return true;
    }
    public Nodo_D_E getHead(){return this.head;}
    public int getSize(){return size;}

}
/*
   \/
   /\
  /  \
\/[][]\/
/\[][]/\
  \  /
   \/
   /\
 */