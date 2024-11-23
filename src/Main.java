import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Declaracion de la pila
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Pila vacia: " + pila);
        System.out.println("¿La pila esta vacia?: "+ pila.isEmpty());

        //Agregar elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Recorrer la pila
        //Foreach, por cada entero que hay en la pila, mostrar por pantalla
        for (Integer pilita: pila){
            System.out.println(pilita);
        }

        //Mostrar
        System.out.println("Pila: " + pila);
        System.out.println("¿La pila esta vacia?: "+ pila.isEmpty()); //Verificar si la pila esta vacia

        //Eliminar el utimo registro que entró
        pila.pop();//(pop = sacar) Para eliminar un elemento de la pila
        //seach no funcia igual cuando se trata de objetos ya que requiere exactitud del valor
        //searh arroja un valor positivo (cual sea) si existe, sino arroja un valor negativo
        System.out.println("¿Esta el 3?:" + pila.search(3));//Buscar un elemento en particular "3"
        System.out.println("El ultimo elemento agregado: " + pila.peek());//(peek = mirar)Traer el ultimo elemento que fue agregado
    }
}

/*
COLECCIONES:

        -Son estructuras similares a los arreglos pero su principal característica es que son dinámicos,
         su tamaño y cantidad de elementos puede variar en el tiempo.
        -En java, se emplean mediante la INTERFAZ "Collections", que permite implementar una serie de métodos comunes
         como son: AÑADIR, ELIMINAR, OBTENER EL TAMAÑO DE LA COLECCIÓN, etc.
        -Tienen el tamaño que se quiera y la capacidad de manera dinamica ajustandose a lo que se requiera.

        Tipos principales de Collections:
            -LIST           De los mas utilizados
            -SET
            -QUEUE
            -MAP            De los mas utilizados


        *ARRAYLIST:
            -Las lista son un conjunto de elementos relacionados entre si que tienen un determinado orden.
            -Su tamaño es dinámico (puede cambiar en el tiempo).

            *CARACTERISTICAS:

                >Es un tipo de CLASE ESPECIAL que se representa como una matriz dinámica qu e permite almacenar elementos.
                >Hereda de la clase AbstractList, la cual implementa la Interfaz List.
                >Permite colecciones o elementos duplicados.
                >El orden de los registros es el orden que fueron insertados.
                >Permite acceso aleatorio (tiene índice)
                >Manipulacion lenta (se necesita recorrer todo el arraylist para hacer un cambio).
                >Solo se pueden agregar (inserción) elementos a la lista

            -En java existen diferentes tipos de listas:
                +ArrayList  (FIFO)
                +LinkedList (FIFO)
                +Stack      (LIFO)

            Tipo de orden que pueden tener las listas:
                -FIFO: First in First Out (El primero en entrar es el primero en salir)
                -LIFO: Last in First Out (El ultimo que entro va a ser el primero en salir)


        *LINKEDLIST: (Lista Enlazada)

            -Tipo de CLASE ESPECIAL
            -Representan a una LISTA DOBLEMEMTE ENLAZADA (forma de recorrerlo de ida y vuelta, ambas direcciones)
            -Permite duplicados
            -Mantiene el orden de inserción
            -Manipulación más rápida
            -Puede ser usada/tratada no solo como lista, sino también como PILA, o como COLA
            -Permite hacer INSERCIONES o ELIMINACIONES al principio o al final de la colección
             (por eso es que puede ser tratado como una pila o cola), ejemplo agregar al inicio con el INDICE[0]
                >Podemos agregar registros al principio y al final

                [0]    [1]<---[2]<---[3]
                [0]--->[1]--->[2]--->[3]


        *Diferencias entre ARRAYLIIST y LINKEDLIST:


        Linked List:

       null <---[0]    [1]<---[2]<---[3]
                [0]--->[1]--->[2]--->[3]--->null
                head                tail



        Array = vector

        [0]--->[1]--->[2]--->[3]--->[4]

        Los arraylist si tienen una posicion como los vectores, solo se agregan al final
        En cambio las linkedlist no ya que se puede agregar otro elemento en cualquier lugar

        Para borrar un elemento en el arraylist se debe indicar la posicion [2] mediante el metodo remove,
        luego reacomoda los demas valores para ocupar esa posicion vacia.
        En cambio en la linkedlist se elimina el elemento y se reacomodan los punteros que señalan los elementos


        LAS PILAS (STACKS)
        -Representan a las pilas en la vida real (pila de objetos)
        -Las pilas cumplen con el modelo LIFO (El ultimo en entrar sera el primero en salir)
        -Las pilas tienen sus propios metodos diferentes a arraylist y linkedist
 */