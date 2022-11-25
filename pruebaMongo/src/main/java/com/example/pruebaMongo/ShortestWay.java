package com.example.pruebaMongo;

public class ShortestWay {
    public void buildMatrix(int startId, int endId){
        Nodo_D_E auxNode = Graph.m_r.getHead();
        boolean ban = false  ;
        while(auxNode!=null) {
            if (auxNode.get_id()==startId) {
                ban = true;
                break;
            }
            auxNode = auxNode.get_N();
        }
        int x= Graph.m_r.getSize();
        if(ban) {
            int minList []= new int [Graph.m_r.getSize()];
            int mat[][] = new int[Graph.m_r.getSize()][Graph.m_r.getSize()];
            int matAux[][] = new int[Graph.m_r.getSize()][Graph.m_r.getSize()];
            mat[0][0] = startId;
            minList[0]= startId;
            int minValue= 0;

            int i=0;
            boolean flag=true;
            while(flag){
                Nodo_D_E aux= auxNode.getData1().getHead();
                minList[i]=auxNode.get_id();
                for(int j=0; j<x; j++){
                    if(i==0) {
                        if(aux==null) break;
                        if (j+1 == aux.get_id()) {
                            mat[i][j] = aux.getW();
                            matAux[i][j]= aux.get_id();
                            aux = aux.get_N();
                        }

                    }
                    else{
                        mat[i][j] = mat[i-1][j];
                        matAux[i][j] = matAux[i-1][j];
                        if (j+1 == aux.get_id()) {
                            if(minValue+aux.getW()<mat[i-1][j]) {
                                mat[i][j] = aux.getW()+minValue;
                                matAux[i][j] = aux.get_id();
                            }
                            if(aux.get_N()!=null) aux = aux.get_N();
                        }
                    }



                }
                i++;
                int temp[]= getMin(mat[i-1], minList);
                auxNode=getNewNode(temp[1], Graph.m_r);
                minValue=temp[0];
                if(temp[0]==-1) flag=false;
            }
            show(mat);
            System.out.println("");
            System.out.println("****");
            show(matAux);
        }

        }
    public void show(int [][] mat){
       int x=mat[0].length;
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++)
                System.out.print(mat[i][j]+" ");
        }
        System.out.println("");
    }
    public int[] getMin(int[] list, int[] minList){
        int [] list1=insertionSort(list);
        int [] min= new int[2];
        for (int i=0; i<list.length; i++) System.out.println(list1[i]);
        min[0]=-1;
        for (int i=0; i< list.length; i++){
            if(validation(list1[i], minList, list)) {
                min[0]=list1[i];
                min[1]=getPos(list1[i], list);
                break;

            }
        }
        return min;
    }
    public Nodo_D_E getNewNode(int id, Lista_D_E list){
        Nodo_D_E aux= list.getHead();
        while (aux!=null){
            if(aux.get_id()==id) return aux;
        }
        return aux;
    }
    public int getPos(int x, int [] list){
        for(int i=0; i< list.length; i++)
            if(x==list[i]) return i+1;
        return 0;
    }
    public boolean validationAux(int x, int [] minList){

        for(int i=0; i< minList.length; i++)
            if(x==minList[i]) return true;
        return false;
    }
    public boolean validation(int value, int [] minList, int list[]){
        boolean flag=true;
        for(int i=0; i< list.length; i++){
            if(value==list[i]){
                if(validationAux(i+1, minList)) flag=false;
                else{
                    flag=true;
                }
            }
        }
        return flag;

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
