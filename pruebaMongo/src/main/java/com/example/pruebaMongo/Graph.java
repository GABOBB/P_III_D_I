package com.example.pruebaMongo;
/**
 * authon: B.B.G.
 */
public class Graph {
    private Lista_D_E m_r;

    public Graph(String id){
        this.m_r = new Lista_D_E(id);
    }

    public void add_node(String N_id){
        Nodo_D_E new_Node = new Nodo_D_E(N_id,true);
        this.m_r.add_F(new_Node);
    }

    public static int random_int(int limit){
        return (int) (Math.random() * limit);
    }
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