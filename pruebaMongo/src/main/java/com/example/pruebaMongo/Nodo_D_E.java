package com.example.pruebaMongo;
/**
 * authon: B.B.G.
 */
public class Nodo_D_E {
    private int _id;
    private Lista_D_E data1=null;
    private int w;
    private boolean conected;
    private Nodo_D_E _N;
    private Nodo_D_E _P;


    public Nodo_D_E(int id, int w){
        this._id = id;
        this.w = w;
        this._N = null;
        this._P = null;
    }

    public int get_id() {return _id;}
    public void set_id(int _id) {this._id = _id;}

    public Lista_D_E getData1() {return data1;}
    public void setData1(Lista_D_E data1) {this.data1 = data1;}

    public int getW() {return w;}
    public void setW(int w) {this.w = w;}

    public Nodo_D_E get_N() {return _N;}
    public void set_N(Nodo_D_E _N) {this._N = _N;}

    public Nodo_D_E get_P() {return _P;}
    public void set_P(Nodo_D_E _P) {this._P = _P;}
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