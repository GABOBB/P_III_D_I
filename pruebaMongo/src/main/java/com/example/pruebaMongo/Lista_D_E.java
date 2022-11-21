package com.example.pruebaMongo;

/**
 * authon: B.B.G.
 */

public class Lista_D_E {
    private String id;
    private Nodo_D_E head;
    private Nodo_D_E last;
    private int size;

    public Lista_D_E(String id) {
        this.id = id;
        this.head = null;
        this.last = null;
        this.size = 0;
    }
    public Lista_D_E (){
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public Nodo_D_E busca_P(String id){
        Nodo_D_E act = this.head;
        if(act == null){
            return null;
        }else{
            while(act != null || act.get_id() == id){

            }
            return act;
        }
    }

    public Nodo_D_E busca_I(int I){
        Nodo_D_E act = this.head;
        int i = 0;
        while(i!=I){
           act = act.get_N();
           i++;
        }
        return act;
    }

    public void add_F(Nodo_D_E nodo){
        Nodo_D_E act = this.head;
        if(act == null){
            this.head = nodo;
        }else {
            nodo.set_N(act);
            act.set_P(nodo);
            this.head = nodo;
        }
        this.size++;
    }

    public void add_L(Nodo_D_E nodo){
        Nodo_D_E act = this.last;
        if(act == null){
            this.head = nodo;
        }else {
            nodo.set_P(act);
            act.set_N(nodo);
            this.last = nodo;
        }
        this.size++;
    }

    public Nodo_D_E getHead(){return this.head;}
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