package com.example.pruebaMongo;
/**
 * Esta clase permite instanciar nodos
 */
public class Nodo_D_E {
    private int _id;
    private Lista_D_E data1=null;
    private int w;
    private boolean conected;
    private Nodo_D_E _N;
    private Nodo_D_E _P;


    /**
     *
     * @param id identifica cada uno de los centros de envío
     * @param w representa el peso de las aristas
     */
    public Nodo_D_E(int id, int w){
        this._id = id;
        this.w = w;
        this._N = null;
        this._P = null;
    }

    /**
     * Otorga el id de cada uno de los nodos
     * @return
     */
    public int get_id() {return _id;}

    /**
     * Se encarga de asignar un id a un nodo en específico
     * @param _id
     */
    public void set_id(int _id) {this._id = _id;}

    /**
     * Obtiene la lista de adyacencia de un nodo
     * @return
     */
    public Lista_D_E getData1() {return data1;}

    /**
     * Asigna la lista de adyacencia de un nodo
     * @param data1 es la lista de adyacencia
     */
    public void setData1(Lista_D_E data1) {this.data1 = data1;}

    /**
     * Obtiene el peso
     * @return
     */
    public int getW() {return w;}

    /**
     * Asigna un peso a un nodo
     * @param w
     */
    public void setW(int w) {this.w = w;}

    /**
     * Obtiene el siguiente nodo
     * @return
     */
    public Nodo_D_E get_N() {return _N;}

    /**
     * Asigna un nodo posterior
     * @param _N
     */
    public void set_N(Nodo_D_E _N) {this._N = _N;}
}
