import Arvore.*;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        No noRaiz = new No('A');
        No noEsquerdo = new No('B');
        No noDireito = new No('C');
        noRaiz.setLeft(noEsquerdo);
        noRaiz.setRight(noDireito);
        arvore.setRaiz(noRaiz);
    }
}