package Arvore;

public class No {
    private char letra;
    private No left;
    private No right;

    public No(char letra) {
        this.letra = letra;
        this.left = null;
        this.right = null;
    }

    public void setConteudo(char letra) {
        this.letra = letra;
    }

    public void setLeft(No left) {
        this.left = left;
    }

    public void setRight(No right) {
        this.right = right;
    }

    public char getConteudo() {
        return this.letra;
    }
}
