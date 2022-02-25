
import javax.swing.JOptionPane;


public class Exec {
    
    public static void jogar(NodeTree node){
        String resposta = JOptionPane.showInputDialog(node.getValue());
            if("sim".equalsIgnoreCase(resposta) || "yes".equalsIgnoreCase(resposta)
               || "s".equalsIgnoreCase(resposta)){
                if(node.getFilhoEsquerdo().getFilhoEsquerdo() != null || 
                   node.getFilhoEsquerdo().getFilhoDireito() != null){
                jogar(node.getFilhoEsquerdo());
                }
                else{
                    JOptionPane.showMessageDialog(null, node.getFilhoEsquerdo());
                }
            }
            else if("não".equalsIgnoreCase(resposta) || "no".equalsIgnoreCase(resposta) ||
                    "n".equalsIgnoreCase(resposta) || "nao".equalsIgnoreCase(resposta)){
                if(node.getFilhoDireito().getFilhoDireito() != null || 
                   node.getFilhoDireito().getFilhoEsquerdo() != null)
                jogar(node.getFilhoDireito());
                else{
                    JOptionPane.showMessageDialog(null, node.getFilhoDireito());
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "As únicas respostas possíveis"
                        + " são SIM / YES ou NÃO / NO");
            }
        }

    public static void main(String[] args) {
        game1();
    }
    
    public static void game1(){
        NodeTree raiz = new NodeTree("O animal é um inseto ?");
        NodeTree filho1 = new NodeTree("O animal é carnivoro ? (yes)");
        NodeTree filho2 = new NodeTree("O animal é carnivoro ? (no)");
        NodeTree filho3 = new NodeTree("É UM LOUVA-DEUS");
        NodeTree filho4 = new NodeTree("É UMA ABELHA");
        NodeTree filho5 = new NodeTree("É UM LEÃO");
        NodeTree filho6 = new NodeTree("É UMA GIRAFA");
        
        raiz.setFilhoEsquerdo(filho1);
        raiz.setFilhoDireito(filho2);
        filho1.setFilhoEsquerdo(filho3);
        filho1.setFilhoDireito(filho4);
        filho2.setFilhoEsquerdo(filho5);
        filho2.setFilhoDireito(filho6);

        jogar(raiz);
    }
}
