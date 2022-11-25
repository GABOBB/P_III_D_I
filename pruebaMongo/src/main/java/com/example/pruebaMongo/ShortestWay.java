package com.example.pruebaMongo;

import org.jetbrains.annotations.NotNull;

public class ShortestWay {
   public void buildMatrix(int startId){
       int [] listShortWays= new int[Graph.m_r.getSize()];
       int [][] matrix = new int[Graph.m_r.getSize()][Graph.m_r.getSize()];
       int [][] matrixCoords = new int[Graph.m_r.getSize()][Graph.m_r.getSize()];
       int [][] graph = madeMatrix();
       int minValue=0;
       int position=0;
       listShortWays[0]=startId;
       for(int i=0; i<Graph.m_r.getSize()-1; i++){
           if(i==0){
               matrix[0]=graph[startId-1];
               minValue=getMinValue(matrix[0], listShortWays);
               position=getPosition(minValue, matrix[0]);
               listShortWays[1]=position;
               for (int j=0; j< graph.length; j++)
                   matrixCoords[0][j]=startId;

           }
           else{
               for(int j=0; j< graph.length; j++){
                   if(graph[position-1][j]==0){
                       matrix[i][j]=matrix[i-1][j];
                       matrixCoords[i][j]=matrixCoords[i-1][j];
                   }
                   else{
                       if(matrix[i-1][j]>(minValue+graph[position-1][j]) || matrix[i-1][j]==0){
                           matrix[i][j]=minValue+graph[position-1][j];
                           matrixCoords[i][j]=position;
                       }
                       else{
                           matrix[i][j]=matrix[i-1][j];
                           matrixCoords[i][j]=matrixCoords[i-1][j];
                       }
                   }
               }
               minValue=getMinValue(matrix[i],listShortWays );
               position=getPosition(minValue, matrix[i]);
               listShortWays[i]=position;
           }
       }
       System.out.println("+++++");
       show(matrix);
       System.out.println("+++++");
       show(matrixCoords);
   }

   public int [][] madeMatrix(){
       int [][] matrix= new int[Graph.m_r.getSize()][Graph.m_r.getSize()];
       Nodo_D_E auxiliarNode= Graph.m_r.getHead();
       Nodo_D_E Nodes= auxiliarNode.getData1().getHead();
       auxiliarNode= Graph.m_r.getHead();
       for(int i=0; i<Graph.m_r.getSize(); i++){

           Nodes= auxiliarNode.getData1().getHead();

           for(int j=0; j<Graph.m_r.getSize(); j++){
               matrix[i][j]=0;
               if(Nodes.get_id()==j+1){
                   matrix[i][j]= Nodes.getW();
               if(Nodes.get_N()!=null) Nodes=Nodes.get_N();}
           }
           auxiliarNode=auxiliarNode.get_N();

       }

       return matrix;
   }
   public boolean validation(int position, int [] list){
       for (int i=0; i<list.length; i++){
           if(position==list[i])
               return false;
       }
       return true;
   }
   public int getMinValue(int list [], int [] minList ){
       int min=0;
       for(int i=0; i< list.length; i++){
           if(list[i]!=0 && validation(1+i, minList))  {
               min=list[i];
               break;
           }
       }
       for(int i=0; i< list.length; i++){
           if(list[i]!=0 && list[i]<min && validation(i+1, minList)){
               min=list[i];
           }
       }
       return min;
   }
   public int getPosition(int weight, int [] list){
       for(int i=0; i< list.length; i++){
           if(weight==list[i]) return i+1;
       }
       return 0;
   }
   public Nodo_D_E FindNode(int id){

       Nodo_D_E aux= Graph.m_r.getHead();
       while(aux!=null)
           aux=aux.get_N();
       return aux;
   }
    public void show(int [][] mat){
       int x=mat[0].length;
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++)
                System.out.print(mat[i][j]+" ");
            System.out.println("");
        }

    }

    public int[] insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        return array;
    }
}
