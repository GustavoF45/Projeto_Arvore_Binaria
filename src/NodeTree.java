
public class NodeTree <E extends Comparable<E>>{
    private String value;
    private NodeTree filhoEsquerdo;
    private NodeTree filhoDireito;

    @Override
    public String toString() {
        return value.toString();
    }
    
    public NodeTree(String valor){
        this.value = valor;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public NodeTree getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(NodeTree filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public NodeTree getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(NodeTree filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
}
