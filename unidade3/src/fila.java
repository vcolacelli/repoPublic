//mport jdk.nashorn.internal.ir.ReturnNode;

public class fila {
private int[] valores;
private int primeiro;
private int ultimo;
private int total;


public fila(){
    valores = new int[10];
    primeiro = 0;
    ultimo = 0;
    total = 0;

}

public void inserir(int elemento) {
    valores[ultimo] = elemento;
    ultimo = (ultimo +1) % valores.length;

}
public int retirar() {
    int elemento = valores[primeiro];
    primeiro = (primeiro + 1) % valores.length;
    total--;
    return elemento;
    
}
public boolean isEmpty(){
    return total==0;
}
public boolean isFull() {
    return total == valores.length;
    
}

}
