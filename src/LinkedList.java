
public class LinkedList {

    class Node {
        int value;
        Node next = null;

        Node(int value) {
            this.value = value;
        }
    }

    protected Node head = null;
    protected Node tail = null;

    public void agregarValorAlInicio(int valor) {
        Node nuevoNodo = new Node(valor);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if (nuevoNodo.next == null) {
            tail = nuevoNodo;
        }
    }

    public void agregarFinal(int valor) {
        Node nuevoNodo = new Node(valor);
        if (tail == null) {
            head = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
    }

    public void agregarPorPosicion(int posicion, int valor) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            agregarValorAlInicio(valor);
        } else {
            Node nuevoNodo = new Node(valor);
            Node actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if (actual.next == null) {
                agregarFinal(valor);
            } else {
                nuevoNodo.next = actual.next;
                actual.next = nuevoNodo;
            }
        }

    }


    public Node ContieneValue(int valor) {

        // se vincula con la coleccion de nodos desde el principio  con head .
        Node nodoActual = head;
        // se recorre todos los nodos buscando el nodo actual y si es igual al valor ingresado. cuando se igual al
        //valor ingresdo en nodo actual quedara guardado el valor
        while (nodoActual != null && nodoActual.value != valor) {
            nodoActual = nodoActual.next;
        }
        // en el caso que ningun nodo tenga el valor el nodo quedaria con una excepcion  ya que el nodoactual seria nulo
        if (nodoActual == null) {
            throw new NullPointerException("Valor no encontrado en los nodos ");

        }
        System.out.println("valor encontrado en los nodos   = " + nodoActual.value);
        return nodoActual;

    }


    public Node obtenerPorPosicion(int position) {

        Node nodoActual = head;
        int contador = 0;
        while (nodoActual != null && contador < position) {
            nodoActual = nodoActual.next;
            contador++;

        }

        if (nodoActual == null) {
            System.out.println("Posicion no existe en los notos actuales, solo hay hasta =  " + (contador -1)+ " y estas buscando =  " + position);
            return null;
        } else {
            System.out.println("Posicion encontrada con el valor = " + nodoActual.value);
            return nodoActual;
        }


    }



    public void eliminarHead(){

        if(head==null ){

            System.out.println( "linked list esta vacio ");
        }else{
            System.out.println("Se elimina primer Head de linked " + head.value);
            head= head.next;
        }


    }


    public void eliminarTail(){

        if(head== null ){
            System.out.println("el linded list esta vacio  " );
        }
         if ( head.next== null){

             head= null;
             System.out.println("Se elimina el ultimo de los nodos " + tail.value);

         }
         Node concurrenciaNodos= head;
         while (concurrenciaNodos.next.next != null ){

             concurrenciaNodos= concurrenciaNodos.next;
             
             
         }
        System.out.println("se elimina el ultimo quedando el nodo anterior como tail  = " + concurrenciaNodos.value);
         concurrenciaNodos.next= null;

    }




    public void eliminarPorValor(int valor) {

        Node primerNodo= head;

        if (primerNodo != null) {
            if (primerNodo.value == valor) {
                primerNodo = primerNodo.next;
            } else {
                Node nodoAnterior = null;
                Node nodoActual = primerNodo;
                while (nodoActual != null && nodoActual.value != valor) {
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.next;
                }
                if (nodoActual != null) {
                    nodoAnterior.next = nodoActual.next;
                }
            }
        }
    }


    public void eliminarPorPosicion( int position){

        Node nodoActual = head;
        Node anterior= null;
        int contador = 0;


        while (nodoActual != null && contador < position ) {
             anterior = nodoActual;
             nodoActual = nodoActual.next;
             contador++;
        }

        if(nodoActual== null){

            System.out.println("No se pudo encontrar el nodo en la posicion especificada = " + position);
        }

        anterior.next= nodoActual.next;
        if(anterior.next==null){
            tail= anterior;

            System.out.println("Nodo eliminado  por posicion =  " + nodoActual.value + " con la position = "+ position);

        }

    }
}
