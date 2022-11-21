package com.example.pruebaMongo;
/**
 * authon: B.B.G.
 */
public class Graph {
    private Lista_D_E m_r;

    public Graph(){
        this.m_r = new Lista_D_E();
    }

    public void add_node(String N_id){
        Nodo_D_E new_Node = new Nodo_D_E(N_id,true);
        this.m_r.add_F(new_Node);
        Nodo_D_E auxN = this.m_r.getHead();
        while(auxN != null){
            if(!auxN.get_id().equals(N_id)) {
                Nodo_D_E _nn = new Nodo_D_E(N_id, random_int(10));
                auxN.getData1().add_L(_nn);
                auxN = auxN.get_N();
            }else{
                Nodo_D_E _nn = new Nodo_D_E(N_id,0);
                auxN.getData1().add_L(_nn);
                auxN = auxN.get_N();
            }
        }
    }

    public static int random_int(int limit){return (int) (Math.random() * limit);}

    public static boolean random_t_f(){return ((int) (Math.random() * 100)%2 == 0);}
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