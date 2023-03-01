public class Main {
    public static void main(String[] args) {
        LinkedList linkedList =  new LinkedList();
        linkedList.agregarValorAlInicio(61);
        linkedList.agregarFinal(30);
        linkedList.agregarFinal(17);
        linkedList.agregarFinal(7);

        linkedList.agregarPorPosicion(1, 14);
        linkedList.agregarPorPosicion(2, 18);

        // desarrollo de puntos:


        linkedList.ContieneValue(17);
        linkedList.ContieneValue(7);
        // confirmacion de posicion:
        linkedList.obtenerPorPosicion(0);

        linkedList.eliminarHead();
        linkedList.obtenerPorPosicion(4);

        linkedList.eliminarTail();
        linkedList.obtenerPorPosicion(3);

        linkedList.eliminarPorPosicion(3);
        linkedList.obtenerPorPosicion(3);





    }
}
