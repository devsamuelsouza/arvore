import Arvore.*;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        No NoA = new No('A');
        No NoB = new No('B');
        No NoC = new No('C');
        No NoD = new No('D');
        No NoE = new No('E');
        No NoF = new No('F');

        arvore.setRaiz(NoA);
        arvore.getRaiz().setLeft(NoB);
        arvore.getRaiz().setRight(NoC);
        arvore.getRaiz().getLeft().setLeft(NoD);
        arvore.getRaiz().getLeft().setRight(NoE);
        arvore.getRaiz().getRight().setRight(NoF);


        System.out.println(arvore.getRaiz().getConteudo());
        System.out.println(arvore.getRaiz().getLeft().getConteudo());
        System.out.println(arvore.getRaiz().getRight().getConteudo());
        System.out.println(arvore.getRaiz().getLeft().getLeft().getConteudo());
        System.out.println(arvore.getRaiz().getLeft().getRight().getConteudo());
        System.out.println(arvore.getRaiz().getRight().getRight().getConteudo());
    }
}