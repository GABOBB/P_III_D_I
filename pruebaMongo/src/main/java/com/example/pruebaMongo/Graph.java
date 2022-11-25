package com.example.pruebaMongo;
/**
 * authon: B.B.G.
 */
public class Graph {
    public static Lista_D_E m_r;
    public static int [][] mat=null;

    public Graph(){
        this.m_r = new Lista_D_E();
    }
    public void addNodes(){
        int x=0;
        boolean ban=true;
        while(ban){
            x=random_int(8);
            if(x>1) ban=false;
        }
        mat=new int[x][x];

        for (int i=0; i<x; i++) {
            Lista_D_E auxiliarList= new Lista_D_E();
            for (int j = 0; j < x; j++) {
                mat[i][j] = 0;
                int random= random_int(2);
                int random1= random_int(x+1);
                System.out.println(random1);

                while(random1==i && j==0){
                    random1=random_int(x);} System.out.println(random1);
                if(random1==x) random1--;

                if(j==random1)  random=1;
                if (random == 1 && i!=j) {
                    mat[i][j] = random_int(9)+1;
                    auxiliarList.addNode(j+1, mat[i][j]);
                }

            }
            Nodo_D_E auxiliarNode= new Nodo_D_E(i+1, 0);
            auxiliarNode.setData1(auxiliarList);
            m_r.addNode(auxiliarNode);
        }

    }
    public void show(){

        for (int i=0; i< m_r.getSize(); i++){
            for (int j=0; j<m_r.getSize(); j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println(" ");

        }
    }
    public void showList(){
        Nodo_D_E aux=m_r.getHead();
        System.out.println("----");
        while(aux!=null){
            System.out.print(aux.getW()+ " ");
            aux.getData1().show();
            System.out.println("");
            aux=aux.get_N();
        }
        System.out.println("");
        System.out.println("---");
        aux=m_r.getHead();
        while(aux!=null){
            System.out.print(aux.getW()+ " ");
            aux.getData1().showId();
            System.out.println("");
            aux=aux.get_N();
        }
    }

    public static int random_int(int limit){return (int) (Math.random() * limit);}
    public static void main(String args[]){
        Graph n= new Graph();
        n.addNodes();
        n.show();
        n.showList();
        ShortestWay n1= new ShortestWay();
        //n1.buildMatrix(1, 5);
    }
}